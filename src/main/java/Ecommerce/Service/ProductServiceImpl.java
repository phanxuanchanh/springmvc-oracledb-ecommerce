package Ecommerce.Service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Ecommerce.DAO.ProductDAO;
import Ecommerce.Entity.Product;

@Service
public class ProductServiceImpl implements IProductService {
	@Autowired
	private ProductDAO productDAO;
	
	public List<Product> GetProducts() {
		return productDAO.GetProducts();
	}

	public Product GetProduct(BigDecimal id) {
		if(productDAO.IsExistProductById(id))
			return productDAO.GetProduct(id);
		return null;
	}

	public boolean CreateProduct(Product product) {
		if(productDAO.IsExistProductByName(product.getName()))
			return false;
		return productDAO.CreateProduct(product);
	}

	public boolean UpdateProduct(Product product) {
		if(productDAO.IsExistProductById(product.getID()))
			return productDAO.UpdateProduct(product);
		return false;
	}

	public boolean DeleteProduct(BigDecimal id) {
		if(productDAO.IsExistProductById(id))
			return productDAO.DeleteProduct(id);
		return false;
	}
}
