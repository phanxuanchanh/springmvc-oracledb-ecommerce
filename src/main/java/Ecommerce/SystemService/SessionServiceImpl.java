package Ecommerce.SystemService;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Ecommerce.SystemDAO.SessionDAO;
import Ecommerce.SystemDTO.ProcessVsSession;
import Ecommerce.SystemEntity.Session;

@Service
public class SessionServiceImpl implements ISessionService {
	@Autowired
	private SessionDAO sessionDAO;
	
	public List<Session> GetSessions() {
		return sessionDAO.GetSessions();
	}

	public Session GetSession(String saddr) {
		if(sessionDAO.IsExistSessionBySaddr(saddr))
			return sessionDAO.GetSession(saddr);
		return null;
	}

	public List<ProcessVsSession> GetProcessVsSessions() {
		return sessionDAO.GetProcessVsSessions();
	}

	public boolean DeleteSession(BigDecimal sid, BigDecimal serial) {
		if(sessionDAO.IsExistSessionBySidAndSerial(sid, serial)) {
			sessionDAO.DeleteSession(sid, serial);
			return true;
		}
		return false;
	}
}
