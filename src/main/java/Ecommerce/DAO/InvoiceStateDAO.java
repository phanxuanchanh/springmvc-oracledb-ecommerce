package Ecommerce.DAO;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import Ecommerce.Entity.InvoiceState;
import Ecommerce.Entity.InvoiceStateMapper;

@SuppressWarnings("restriction")
@Repository
public class InvoiceStateDAO {
	@Autowired
	@Resource(name = "jdbcTemplate")
	private JdbcTemplate jdbcTemplate;
	
	public List<InvoiceState> GetInvoiceStates(){
		List<InvoiceState> invoiceStates = new ArrayList<InvoiceState>();
		String query = "Select * from  ThuongMaiDienTu_Web.InvoiceStates";
		invoiceStates = jdbcTemplate.query(query, new InvoiceStateMapper());
		return invoiceStates;
	}
	
	public InvoiceState GetInvoiceState(BigDecimal id) {
		InvoiceState invoiceState = null;
		String query = "Select * from  ThuongMaiDienTu_Web.InvoiceStates where ID = ?";
		invoiceState = jdbcTemplate.queryForObject(query, new Object[] { id }, new InvoiceStateMapper());
		return invoiceState;
	}
	
	public boolean CreateInvoiceState(InvoiceState invoiceState) {
		String query = "Insert into  ThuongMaiDienTu_Web.InvoiceStates(\"name\", \"description\", createAt, updateAt) values(?, ?, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP)";
		int affected = jdbcTemplate.update(query, new Object[] { invoiceState.getName(), invoiceState.getDescription() });
		return (affected > 0);
	}

	public boolean UpdateInvoiceState(InvoiceState invoiceState) {
		String query = "Update  ThuongMaiDienTu_Web.InvoiceStates set \"name\" = ?, \"description\" = ?, updateAt = CURRENT_TIMESTAMP where ID = ?";
		int affected = jdbcTemplate.update(query,
				new Object[] { invoiceState.getName(), invoiceState.getDescription(), invoiceState.getID() });
		return (affected > 0);
	}
	
	public boolean DeleteInvoiceState(BigDecimal id) {
		String query = "Delete from  ThuongMaiDienTu_Web.InvoiceStates where ID = ?";
		int affected = jdbcTemplate.update(query, new Object[] { id });
		return (affected > 0);
	}
	
	public int CountInvoiceState() {
		String query = "Select count(*) from  ThuongMaiDienTu_Web.InvoiceStates";
		int count = jdbcTemplate.queryForObject(query, Integer.class);
		return count;
	}
	
	public boolean IsExistInvoiceStateById(BigDecimal id) {
		String query = "Select count(*) from  ThuongMaiDienTu_Web.InvoiceStates where ID = ?";
		int count = jdbcTemplate.queryForObject(query, new Object[] { id }, Integer.class);
		return (count > 0);
	}

	public boolean IsExistInvoiceStateByName(String name) {
		String query = "Select count(*) from  ThuongMaiDienTu_Web.InvoiceStates where \"name\" = ?";
		int count = jdbcTemplate.queryForObject(query, new Object[] { name }, Integer.class);
		return (count > 0);
	}
}
