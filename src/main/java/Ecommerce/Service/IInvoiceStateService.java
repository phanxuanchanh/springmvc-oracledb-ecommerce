package Ecommerce.Service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Ecommerce.Entity.InvoiceState;

@Service
public interface IInvoiceStateService {
	@Autowired
	
	List<InvoiceState> GetInvoiceStates();

	InvoiceState GetInvoiceState(BigDecimal id);

	boolean CreateInvoiceState(InvoiceState invoiceState);

	boolean UpdateInvoiceState(InvoiceState invoiceState);

	boolean DeleteInvoiceState(BigDecimal id);
}
