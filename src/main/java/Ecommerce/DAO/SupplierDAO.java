package Ecommerce.DAO;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import Ecommerce.Entity.Supplier;
import Ecommerce.Entity.SupplierMapper;

@SuppressWarnings("restriction")
@Repository
public class SupplierDAO {
	@Autowired
	@Resource(name = "jdbcTemplate")
	private JdbcTemplate jdbcTemplate;
	
	public List<Supplier> GetSuppliers(){
		List<Supplier> suppliers = new ArrayList<Supplier>();
		String query = "Select * from ThuongMaiDienTu_Web.Suppliers";
		suppliers = jdbcTemplate.query(query, new SupplierMapper());
		return suppliers;
	}
	
	public Supplier GetSupplier(BigDecimal id) {
		Supplier supplier = null;
		String query = "Select * from ThuongMaiDienTu_Web.Suppliers where ID = ?";
		supplier = jdbcTemplate.queryForObject(query, new Object[] { id }, new SupplierMapper());
		return supplier;
	}
	
	public boolean CreateSupplier(Supplier supplier) {
		String query = "Insert into ThuongMaiDienTu_Web.Suppliers(\"name\", \"description\", phone, email, fax, createAt, updateAt) "
				+ "values(?, ?, ?, ?, ?, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP)";
		int affected = jdbcTemplate.update(query, new Object[] { supplier.getName(), supplier.getDescription(), supplier.getPhone(), supplier.getEmail(), 
				supplier.getFax() });
		return (affected > 0);
	}

	public boolean UpdateSupplier(Supplier supplier) {
		String query = "Update ThuongMaiDienTu_Web.Suppliers set \"name\" = ?, \"description\" = ?, phone = ?, email = ?, fax = ?, updateAt = CURRENT_TIMESTAMP where ID = ?";
		int affected = jdbcTemplate.update(query,
				new Object[] { supplier.getName(), supplier.getDescription(), supplier.getPhone(), supplier.getEmail(), 
						supplier.getFax(), supplier.getID() });
		return (affected > 0);
	}
	
	public boolean DeleteSupplier(BigDecimal id) {
		String query = "Delete from ThuongMaiDienTu_Web.Suppliers where ID = ?";
		int affected = jdbcTemplate.update(query, new Object[] { id });
		return (affected > 0);
	}
	
	public boolean IsExistSupplierById(BigDecimal id) {
		String query = "Select count(*) from ThuongMaiDienTu_Web.Suppliers where ID = ?";
		int count = jdbcTemplate.queryForObject(query, new Object[] { id }, Integer.class);
		return (count > 0);
	}

	public boolean IsExistSupplierByName(String name) {
		String query = "Select count(*) from ThuongMaiDienTu_Web.Suppliers where \"name\" = ?";
		int count = jdbcTemplate.queryForObject(query, new Object[] { name }, Integer.class);
		return (count > 0);
	}
	
	public int CountSupplier() {
		String query = "Select count(*) from ThuongMaiDienTu_Web.Suppliers";
		int count = jdbcTemplate.queryForObject(query, Integer.class);
		return count;
	}
}