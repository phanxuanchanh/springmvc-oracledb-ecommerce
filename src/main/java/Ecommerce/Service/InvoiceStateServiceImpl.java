package Ecommerce.Service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Ecommerce.DAO.InvoiceStateDAO;
import Ecommerce.Entity.InvoiceState;

@Service
public class InvoiceStateServiceImpl implements IInvoiceStateService {
	@Autowired
	private InvoiceStateDAO invoiceStateDAO;
	
	public List<InvoiceState> GetInvoiceStates() {
		return invoiceStateDAO.GetInvoiceStates();
	}

	public InvoiceState GetInvoiceState(BigDecimal id) {
		if(invoiceStateDAO.IsExistInvoiceStateById(id))
			return invoiceStateDAO.GetInvoiceState(id);
		return null;
	}

	public boolean CreateInvoiceState(InvoiceState invoiceState) {
		if(invoiceStateDAO.IsExistInvoiceStateByName(invoiceState.getName()))
			return false;
		return invoiceStateDAO.CreateInvoiceState(invoiceState);
	}

	public boolean UpdateInvoiceState(InvoiceState invoiceState) {
		if(invoiceStateDAO.IsExistInvoiceStateById(invoiceState.getID()))
			return invoiceStateDAO.UpdateInvoiceState(invoiceState);
		return false;
	}

	public boolean DeleteInvoiceState(BigDecimal id) {
		if(invoiceStateDAO.IsExistInvoiceStateById(id))
			return invoiceStateDAO.DeleteInvoiceState(id);
		return false;
	}
}
