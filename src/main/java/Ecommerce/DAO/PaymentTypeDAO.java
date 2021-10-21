package Ecommerce.DAO;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import Ecommerce.Entity.PaymentType;
import Ecommerce.Entity.PaymentTypeMapper;

@SuppressWarnings("restriction")
@Repository
public class PaymentTypeDAO {
	@Autowired
	@Resource(name = "jdbcTemplate")
	private JdbcTemplate jdbcTemplate;
	
	public List<PaymentType> GetPaymentTypes(){
		List<PaymentType> paymentTypes = new ArrayList<PaymentType>();
		String query = "Select * from  ThuongMaiDienTu_Web.PaymentTypes";
		paymentTypes = jdbcTemplate.query(query, new PaymentTypeMapper());
		return paymentTypes;
	}
	
	public PaymentType GetPaymentType(BigDecimal id) {
		PaymentType paymentType = null;
		String query = "Select * from  ThuongMaiDienTu_Web.PaymentTypes where ID = ?";
		paymentType = jdbcTemplate.queryForObject(query, new Object[] { id }, new PaymentTypeMapper());
		return paymentType;
	}
	
	public boolean CreatePaymentType(PaymentType paymentType) {
		String query = "Insert into  ThuongMaiDienTu_Web.PaymentTypes(\"name\", \"description\", createAt, updateAt) values(?, ?, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP)";
		int affected = jdbcTemplate.update(query, new Object[] { paymentType.getName(), paymentType.getDescription() });
		return (affected > 0);
	}

	public boolean UpdatePaymentType(PaymentType paymentType) {
		String query = "Update  ThuongMaiDienTu_Web.PaymentTypes set \"name\" = ?, \"description\" = ?, updateAt = CURRENT_TIMESTAMP where ID = ?";
		int affected = jdbcTemplate.update(query,
				new Object[] { paymentType.getName(), paymentType.getDescription(), paymentType.getID() });
		return (affected > 0);
	}
	
	public boolean DeletePaymentType(BigDecimal id) {
		String query = "Delete from  ThuongMaiDienTu_Web.PaymentTypes where ID = ?";
		int affected = jdbcTemplate.update(query, new Object[] { id });
		return (affected > 0);
	}
	
	public int CountPaymentType() {
		String query = "Select count(*) from  ThuongMaiDienTu_Web.PaymentTypes";
		int count = jdbcTemplate.queryForObject(query, Integer.class);
		return count;
	}
	
	public boolean IsExistPaymentTypeById(BigDecimal id) {
		String query = "Select count(*) from  ThuongMaiDienTu_Web.PaymentTypes where ID = ?";
		int count = jdbcTemplate.queryForObject(query, new Object[] { id }, Integer.class);
		return (count > 0);
	}

	public boolean IsExistPaymentTypeByName(String name) {
		String query = "Select count(*) from  ThuongMaiDienTu_Web.PaymentTypes where \"name\" = ?";
		int count = jdbcTemplate.queryForObject(query, new Object[] { name }, Integer.class);
		return (count > 0);
	}
}
