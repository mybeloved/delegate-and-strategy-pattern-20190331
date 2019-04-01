package strategypattern.promotion;

/**
 * @Program: delegate-and-strategy-pattern-20190331
 * @Description: 优惠券策略
 * @Author: whx
 * @Create: 2019-03-31 21:05
 **/
public class CouponStrategy implements PromotionStrategy {
	
	public void doPromotion() {
		System.out.println("领取优惠券,课程的价格直接减优惠券面值抵扣");
	}
}
