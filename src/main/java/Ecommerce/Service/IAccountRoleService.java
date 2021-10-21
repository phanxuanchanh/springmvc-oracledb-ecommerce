package Ecommerce.Service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Ecommerce.Entity.AccountRole;

@Service
public interface IAccountRoleService {
	@Autowired
	
	List<AccountRole> GetAccountRoles();

	AccountRole GetAccountRole(BigDecimal id);

	boolean CreateAccountRole(AccountRole accountRole);

	boolean UpdateAccountRole(AccountRole accountRole);

	boolean DeleteAccountRole(BigDecimal id);
}
