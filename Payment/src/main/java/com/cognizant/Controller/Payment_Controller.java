package com.cognizant.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Payment_Controller {
	
	@GetMapping("payment")
	public String getpayment() {
		return "payment-service";
	}
	@Autowired
	private Sales_Controller salesController;
	
	@GetMapping("PaymentSales")
	public String getsales() {
        String Sales = Sales_Controller.getSales();
        return Sales;// Calling Payment Service	}

}
}
