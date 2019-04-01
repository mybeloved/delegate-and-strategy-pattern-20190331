package strategypattern.pay.payport;

/**
 * @Program: delegate-and-strategy-pattern-20190331
 * @Description: 微信支付策略
 * @Author: whx
 * @Create: 2019-03-31 21:05
 **/
public class WechatPay extends Payment {
	
	public String getName() {
		return "微信支付";
	}
	
	protected double queryBalance(String uid) {
		return 256;
	}
	
}
