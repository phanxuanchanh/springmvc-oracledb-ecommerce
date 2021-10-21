package Ecommerce.TestController;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import Ecommerce.Entity.Admin;
import Ecommerce.Service.AdminServiceImpl;

@Controller
public class SampleController {
	
	@Autowired
	private AdminServiceImpl adminServiceImpl;
	
	@RequestMapping(value = "/test/tao-du-lieu-mau", method = RequestMethod.GET)
	public ModelAndView GenerateSampleData() {
		/*AccountRole accountRole1 = new AccountRole(null, "QuanTriVien", "Quản trị viên", null, null);
		AccountRole accountRole2 = new AccountRole(null, "NhanVien", "Nhân viên", null, null);
		accountRoleServiceImpl.CreateRole(accountRole1);
		accountRoleServiceImpl.CreateRole(accountRole2);*/
		
		
		String adminPassword = "phanxuanchanh_oracle";
		
		Admin admin = new Admin(
				null, "phanxuanchanh", "Phan Xuân Chánh", "male", "Không có mô tả", "phanxuanchanh77@gmail.com",
				new Timestamp(2001, 07, 07, 0, 0, 0, 0), "", "0343583276", BCrypt.hashpw(adminPassword, BCrypt.gensalt(12)),
				new BigDecimal(1), null, null);
		
		adminServiceImpl.CreateAdmin(admin);
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("admin/sample-data");
		return modelAndView;
	}
}
