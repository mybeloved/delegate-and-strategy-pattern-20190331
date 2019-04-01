package strategypattern.pay;

import strategypattern.pay.payport.PayStrategy;
import strategypattern.pay.payport.Payment;

/**
 * @Program: delegate-and-strategy-pattern-20190331
 * @Description: 订单
 * @Author: whx
 * @Create: 2019-03-31 21:05
 **/
public class Order {
	private String uid;
	private String orderId;
	private double amount;
	
	public Order(String uid, String orderId, double amount) {
		this.uid = uid;
		this.orderId = orderId;
		this.amount = amount;
	}
	
	//完美地解决了switch的过程，不需要在代码逻辑中写switch了
	//更不需要写if    else if
	public MsgResult pay() {
		return pay(PayStrategy.DEFAULT_PAY);
	}
	
	public MsgResult pay(String payKey) {
		Payment payment = PayStrategy.get(payKey);
		System.out.println("欢迎使用" + payment.getName());
		System.out.println("本次交易金额为：" + amount + "，开始扣款...");
		return payment.pay(uid, amount);
	}
}
