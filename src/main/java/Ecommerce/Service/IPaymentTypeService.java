package Ecommerce.Service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Ecommerce.Entity.PaymentType;

@Service
public interface IPaymentTypeService {
	@Autowired
	
	List<PaymentType> GetPaymentTypes();

	PaymentType GetPaymentType(BigDecimal id);

	boolean CreatePaymentType(PaymentType paymentType);

	boolean UpdatePaymentType(PaymentType paymentType);

	boolean DeletePaymentType(BigDecimal id);
}
