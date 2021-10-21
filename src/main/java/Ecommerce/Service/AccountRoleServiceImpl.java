package Ecommerce.Service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Ecommerce.DAO.AccountRoleDAO;
import Ecommerce.Entity.AccountRole;

@Service
public class AccountRoleServiceImpl implements IAccountRoleService {
	@Autowired
	private AccountRoleDAO accountRoleDAO;
	
	public List<AccountRole> GetAccountRoles() {
		return accountRoleDAO.GetAccountRoles();
	}
	
	public AccountRole GetAccountRole(BigDecimal id) {
		if(accountRoleDAO.IsExistAccountRoleById(id))
			return accountRoleDAO.GetAccountRole(id);
		return null;
	}

	public boolean CreateAccountRole(AccountRole accountRole) {
		if(accountRoleDAO.IsExistAccountRoleByName(accountRole.getName()))
			return false;
		return accountRoleDAO.CreateAccountRole(accountRole);
	}

	public boolean UpdateAccountRole(AccountRole accountRole) {
		if(accountRoleDAO.IsExistAccountRoleById(accountRole.getID()))
			return accountRoleDAO.UpdateAccountRole(accountRole);
		return false;
	}

	public boolean DeleteAccountRole(BigDecimal id) {
		if(accountRoleDAO.IsExistAccountRoleById(id))
			return accountRoleDAO.DeleteAccountRole(id);
		return false;
	}
}
