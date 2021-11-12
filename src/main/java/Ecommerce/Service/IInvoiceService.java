package Ecommerce.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Ecommerce.Entity.Invoice;

@Service
public interface IInvoiceService {
	@Autowired
	
	void UpdateAllUnitPriceAndIntoMoney();
	
	void UpdateAllTotalMoney();
	
	List<Invoice> GetInvoices();
}
