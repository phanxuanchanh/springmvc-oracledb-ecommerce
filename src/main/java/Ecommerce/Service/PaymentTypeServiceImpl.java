package Ecommerce.Service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Ecommerce.DAO.PaymentTypeDAO;
import Ecommerce.Entity.PaymentType;

@Service
public class PaymentTypeServiceImpl implements IPaymentTypeService {
	@Autowired
	private PaymentTypeDAO paymentTypeDAO;
	
	public List<PaymentType> GetPaymentTypes() {
		return paymentTypeDAO.GetPaymentTypes();
	}

	public PaymentType GetPaymentType(BigDecimal id) {
		if(paymentTypeDAO.IsExistPaymentTypeById(id))
			return paymentTypeDAO.GetPaymentType(id);
		return null;
	}

	public boolean CreatePaymentType(PaymentType paymentType) {
		if(paymentTypeDAO.IsExistPaymentTypeByName(paymentType.getName()))
			return false;
		return paymentTypeDAO.CreatePaymentType(paymentType);
	}

	public boolean UpdatePaymentType(PaymentType paymentType) {
		if(paymentTypeDAO.IsExistPaymentTypeById(paymentType.getID()))
			return paymentTypeDAO.UpdatePaymentType(paymentType);
		return false;
	}

	public boolean DeletePaymentType(BigDecimal id) {
		if(paymentTypeDAO.IsExistPaymentTypeById(id))
			return paymentTypeDAO.DeletePaymentType(id);
		return false;
	}
}
