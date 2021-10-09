package Ecommerce.SystemService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Ecommerce.SystemDAO.SGADAO;
import Ecommerce.SystemEntity.SGA;

@Service
public class SGAServiceImpl implements ISGAService {
	@Autowired
	private SGADAO sgaDao;

	public List<SGA> GetSGAs() {
		return sgaDao.GetSGAs();
	}
}
