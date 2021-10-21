package Ecommerce.Service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Ecommerce.Entity.Supplier;

@Service
public interface ISupplierService {
	@Autowired
	
	List<Supplier> GetSuppliers();
		
	Supplier GetSupplier(BigDecimal id);
	
	boolean CreateSupplier(Supplier supplier);
	
	boolean UpdateSupplier(Supplier supplier);
	
	boolean DeleteSupplier(BigDecimal id);
}
