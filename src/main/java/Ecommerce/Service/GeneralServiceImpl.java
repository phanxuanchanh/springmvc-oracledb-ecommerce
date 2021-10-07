package Ecommerce.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Ecommerce.DAO.CustomerDAO;
import Ecommerce.DAO.ProductCategoryDAO;
import Ecommerce.DAO.ProductDAO;
import Ecommerce.DAO.SupplierDAO;
import Ecommerce.DTO.Analyst;

@Service
public class GeneralServiceImpl implements IGeneralService {
	@Autowired
	private CustomerDAO customerDAO;
	
	@Autowired
	private ProductDAO productDAO;
	
	@Autowired
	private ProductCategoryDAO productCategoryDAO;
	
	@Autowired
	private SupplierDAO supplierDAO;
	
	public Analyst GetAnalyst() {
		Analyst analyst = new Analyst(productDAO.CountProduct(), productCategoryDAO.CountProductCategory(), 
				supplierDAO.CountSupplier(), customerDAO.CountCustomer());
		return analyst;
	}

}
