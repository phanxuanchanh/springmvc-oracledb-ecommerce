package Ecommerce.SystemService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Ecommerce.SystemEntity.SGA;

@Service
public interface ISGAService {
	@Autowired
	
	List<SGA> GetSGAs();
}
