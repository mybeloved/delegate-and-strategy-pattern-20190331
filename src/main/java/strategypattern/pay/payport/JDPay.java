package strategypattern.pay.payport;


/**
 * @Program: delegate-and-strategy-pattern-20190331
 * @Description: 京东白条支付策略
 * @Author: whx
 * @Create: 2019-03-31 21:05
 **/
public class JDPay extends Payment {
	
	public String getName() {
		return "京东白条";
	}
	
	protected double queryBalance(String uid) {
		return 500;
	}
}
