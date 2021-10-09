package Ecommerce.SystemService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Ecommerce.SystemEntity.Sga;

@Service
public interface ISgaService {
	@Autowired
	
	List<Sga> GetSgas();
}
