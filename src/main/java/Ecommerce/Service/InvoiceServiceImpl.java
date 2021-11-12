package Ecommerce.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Ecommerce.DAO.InvoiceDAO;
import Ecommerce.Entity.Invoice;

@Service
public class InvoiceServiceImpl implements IInvoiceService {
	@Autowired
	private InvoiceDAO invoiceDAO;
	
	public void UpdateAllUnitPriceAndIntoMoney() {
		invoiceDAO.UpdateAllUnitPriceAndIntoMoney();
	}

	public void UpdateAllTotalMoney() {
		invoiceDAO.UpdateAllTotalMoney();
	}

	@Override
	public List<Invoice> GetInvoices() {
		return invoiceDAO.GetInvoices();
	}
}
