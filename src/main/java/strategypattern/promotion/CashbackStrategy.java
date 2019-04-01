package strategypattern.promotion;

/**
 * @Program: delegate-and-strategy-pattern-20190331
 * @Description: 返现策略
 * @Author: whx
 * @Create: 2019-03-31 21:05
 **/
public class CashbackStrategy implements PromotionStrategy {
	
	public void doPromotion() {
		System.out.println("返现促销,返回的金额转到支付宝账号");
	}
}
