package Ecommerce.Service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Ecommerce.DAO.ProductCategoryDAO;
import Ecommerce.Entity.ProductCategory;

@Service
public class ProductCategoryServiceImpl implements IProductCategoryService {
	@Autowired
	private ProductCategoryDAO productCategoryDAO;
	
	public List<ProductCategory> GetProductCategories() {
		return productCategoryDAO.GetProductCategories();
	}

	public ProductCategory GetProductCategory(BigDecimal id) {
		if(productCategoryDAO.IsExistProductCategoryById(id))
			return productCategoryDAO.GetProductCategory(id);
		return null;
	}

	public boolean CreateProductCategory(ProductCategory productCategory) {
		if(productCategoryDAO.IsExistProductCategoryByName(productCategory.getName()))
			return false;
		return productCategoryDAO.CreateProductCategory(productCategory);
	}

	public boolean UpdateProductCategory(ProductCategory productCategory) {
		if(productCategoryDAO.IsExistProductCategoryById(productCategory.getID()))
			return productCategoryDAO.UpdateProductCategory(productCategory);
		return false;
	}

	public boolean DeleteProductCategory(BigDecimal id) {
		if(productCategoryDAO.IsExistProductCategoryById(id))
			return productCategoryDAO.DeleteProductCategory(id);
		return false;
	}
}
