package Ecommerce.SystemService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Ecommerce.SystemDAO.SgaDAO;
import Ecommerce.SystemEntity.Sga;

@Service
public class SgaServiceImpl implements ISgaService {
	@Autowired
	private SgaDAO sgaDao;

	public List<Sga> GetSgas() {
		return sgaDao.GetSgas();
	}
}
