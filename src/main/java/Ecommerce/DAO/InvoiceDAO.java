package Ecommerce.DAO;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import Ecommerce.Entity.Invoice;
import Ecommerce.Entity.InvoiceMapper;

@SuppressWarnings("restriction")
@Repository
public class InvoiceDAO {
	@Autowired
	@Resource(name = "jdbcTemplate")
	private JdbcTemplate jdbcTemplate;
	
	public void UpdateAllUnitPriceAndIntoMoney() {
		SimpleJdbcCall simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withCatalogName("ThuongMaiDienTu_Web")
				.withProcedureName("proc_CapNhatDonGiaVaThanhTien");
		
		Map<String, Object> inParamMap = new HashMap<String, Object>();
		SqlParameterSource in = new MapSqlParameterSource(inParamMap);
		simpleJdbcCall.execute(in);
	}
	
	public void UpdateAllTotalMoney() {
		SimpleJdbcCall simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withCatalogName("ThuongMaiDienTu_Web")
				.withProcedureName("proc_CapNhatTongTien");
		
		Map<String, Object> inParamMap = new HashMap<String, Object>();
		SqlParameterSource in = new MapSqlParameterSource(inParamMap);
		simpleJdbcCall.execute(in);
	}
	
	public List<Invoice> GetInvoices(){
		String query = "Select * from ThuongMaiDienTu_Web.Invoices";
		return jdbcTemplate.query(query, new InvoiceMapper());
	}
}
