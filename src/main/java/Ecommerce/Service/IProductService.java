package Ecommerce.Service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Ecommerce.Entity.Product;

@Service
public interface IProductService {
	@Autowired
	
	List<Product> GetProducts();
	
	Product GetProduct(BigDecimal id);
	
	boolean CreateProduct(Product product);
	
	boolean UpdateProduct(Product product);
	
	boolean DeleteProduct(BigDecimal id);
}
