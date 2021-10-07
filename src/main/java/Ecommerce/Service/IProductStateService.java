package Ecommerce.Service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Ecommerce.Entity.ProductState;

@Service
public interface IProductStateService {
	@Autowired
	
	List<ProductState> GetProductStates();

	ProductState GetProductState(BigDecimal id);

	boolean CreateProductState(ProductState productState);

	boolean UpdateProductState(ProductState productState);

	boolean DeleteProductState(BigDecimal id);
}
