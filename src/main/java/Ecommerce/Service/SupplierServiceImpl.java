package Ecommerce.Service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Ecommerce.DAO.SupplierDAO;
import Ecommerce.Entity.Supplier;

@Service
public class SupplierServiceImpl implements ISupplierService {
	@Autowired
	private SupplierDAO supplierDAO;
	
	public List<Supplier> GetSuppliers() {
		return supplierDAO.GetSuppliers();
	}

	public Supplier GetSupplier(BigDecimal id) {
		if(supplierDAO.IsExistSupplierById(id))
			return supplierDAO.GetSupplier(id);
		return null;
	}

	public boolean CreateSupplier(Supplier supplier) {
		if(supplierDAO.IsExistSupplierByName(supplier.getName()))
			return false;
		return supplierDAO.CreateSupplier(supplier);
	}

	public boolean UpdateSupplier(Supplier supplier) {
		if(supplierDAO.IsExistSupplierById(supplier.getID()))
			return supplierDAO.UpdateSupplier(supplier);
		return false;
	}

	public boolean DeleteSupplier(BigDecimal id) {
		if(supplierDAO.IsExistSupplierById(id))
			return supplierDAO.DeleteSupplier(id);
		return false;
	}
}
