package Ecommerce.Service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Ecommerce.DAO.ProductStateDAO;
import Ecommerce.Entity.ProductState;


@Service
public class ProductStateServiceImpl implements IProductStateService {
	@Autowired
	private ProductStateDAO productStateDAO;
	
	public List<ProductState> GetProductStates() {
		return productStateDAO.GetProductStates();
	}

	public ProductState GetProductState(BigDecimal id) {
		if(productStateDAO.IsExistProductStateById(id))
			return productStateDAO.GetProductState(id);
		return null;
	}

	public boolean CreateProductState(ProductState productState) {
		if(productStateDAO.IsExistProductStateByName(productState.getName()))
			return false;
		return productStateDAO.CreateProductState(productState);
	}

	public boolean UpdateProductState(ProductState productState) {
		if(productStateDAO.IsExistProductStateById(productState.getID()))
			return productStateDAO.UpdateProductState(productState);
		return false;
	}

	public boolean DeleteProductState(BigDecimal id) {
		if(productStateDAO.IsExistProductStateById(id))
			return productStateDAO.DeleteProductState(id);
		return false;
	}
	
}
