package Ecommerce.Service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Ecommerce.Entity.ProductCategory;

@Service
public interface IProductCategoryService {
	@Autowired
	
	List<ProductCategory> GetProductCategories();

	ProductCategory GetProductCategory(BigDecimal id);

	boolean CreateProductCategory(ProductCategory productCategory);

	boolean UpdateProductCategory(ProductCategory productCategory);

	boolean DeleteProductCategory(BigDecimal id);
}
