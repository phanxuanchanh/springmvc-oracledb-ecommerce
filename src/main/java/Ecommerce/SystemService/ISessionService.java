package Ecommerce.SystemService;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Ecommerce.SystemDTO.ProcessVsSession;
import Ecommerce.SystemEntity.Session;

@Service
public interface ISessionService {
	@Autowired
	
	List<Session> GetSessions();
	
	Session GetSession(String saddr);
	
	List<ProcessVsSession> GetProcessVsSessions();
	
	boolean DeleteSession(BigDecimal sid, BigDecimal serial);
}
