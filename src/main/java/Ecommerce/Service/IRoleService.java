package Ecommerce.Service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Ecommerce.Entity.Role;

@Service
public interface IRoleService {
	@Autowired
	
	List<Role> GetRoles();

	Role GetRole(BigDecimal id);

	boolean CreateRole(Role role);

	boolean UpdateRole(Role role);

	boolean DeleteRole(BigDecimal id);
}
