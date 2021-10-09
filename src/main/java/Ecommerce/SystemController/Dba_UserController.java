package Ecommerce.SystemController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import Ecommerce.SystemService.Dba_UserServiceImpl;

@Controller
public class Dba_UserController {
	@Autowired
	private Dba_UserServiceImpl dba_UserServiceImpl;
	
	
}
