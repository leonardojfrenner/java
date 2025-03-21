package model.service;

public class PaypalService implements OnlinePaymentService{

	@Override
	public Double paymentFee(Double amount) {
		return amount*0.02;
	}

	@Override
	public Double interest(Double amount, Integer month) {
		return amount *0.01 * month;
	}

}
