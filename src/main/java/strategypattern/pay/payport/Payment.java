package strategypattern.pay.payport;


import strategypattern.pay.MsgResult;

/**
 * @Program: delegate-and-strategy-pattern-20190331
 * @Description: 支付渠道
 * @Author: whx
 * @Create: 2019-03-31 21:05
 **/
public abstract class Payment {
	
	//支付类型
	public abstract String getName();
	
	//查询余额
	protected abstract double queryBalance(String uid);
	
	//扣款支付
	public MsgResult pay(String uid, double amount) {
		if (queryBalance(uid) < amount) {
			return new MsgResult(500, "支付失败", "余额不足");
		}
		return new MsgResult(200, "支付成功", "支付金额：" + amount);
	}
	
	
}
