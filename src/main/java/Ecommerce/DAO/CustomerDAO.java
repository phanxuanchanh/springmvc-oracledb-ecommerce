package Ecommerce.DAO;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import Ecommerce.Entity.Customer;
import Ecommerce.Entity.CustomerMapper;

@SuppressWarnings("restriction")
@Repository
public class CustomerDAO {
	@Autowired
	@Resource(name = "jdbcTemplate")
	private JdbcTemplate jdbcTemplate;
	
	public List<Customer> GetCustomers() {
		List<Customer> customers = new ArrayList<Customer>();
		String query = "Select * from ThuongMaiDienTu_Web.Customers";
		customers = jdbcTemplate.query(query, new CustomerMapper());
		return customers;
	}

	public Customer GetCustomer(int id) {
		Customer customer = null;
		String query = "Select * from ThuongMaiDienTu_Web.Customers where Id = ?";
		customer = jdbcTemplate.queryForObject(query, new Object[] { id }, new CustomerMapper());
		return customer;
	}

	public boolean CreateCustomer(Customer customer) {
		String query = "Insert into Customer(username, fullname, gender, description, email, birthday, avatar, phone, password, isActivated, createAt, updateAt) "
				+ "values(?, ?, ?, ?, ?, ?, ?, ?, ?, 'YES', ?, ?)";
		int affected = jdbcTemplate.update(query, new Object[] { customer.getUsername(), customer.getFullname(), customer.getGender(),
				customer.getDescription(), customer.getEmail(), customer.getBirthday(), customer.getAvatar(), customer.getPhone(), customer.getPassword(),
				new Timestamp(0), new Timestamp(0) });
		return (affected > 0);
	}

	public boolean UpdateCustomer(Customer customer) {
		String query = "Update Customer set username = ?, fullname = ?, gender = ?, description = ?, email = ?, "
				+ "birthday = ?, avatar = ?, phone = ?, updateAt = ? where Id = ?";
		int affected = jdbcTemplate.update(query, new Object[] {  customer.getUsername(), customer.getFullname(), customer.getGender(),
				customer.getDescription(), customer.getEmail(), customer.getBirthday(), customer.getAvatar(), customer.getPhone(), customer.getPassword(),
				new Timestamp(0) });
		return (affected > 0);
	}

	public boolean DeleteCustomer(int id) {
		String query = "Delete from ThuongMaiDienTu_Web.Customer where Id = ?";
		int affected = jdbcTemplate.update(query, new Object[] { id });
		return (affected > 0);
	}
	
	public int CountCustomer() {
		String query = "Select count(*) from ThuongMaiDienTu_Web.Customers";
		int count = jdbcTemplate.queryForObject(query, Integer.class);
		return count;
	}
}
