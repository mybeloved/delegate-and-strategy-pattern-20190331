package strategypattern.promotion;

/**
 * @Program: delegate-and-strategy-pattern-20190331
 * @Description: 团购策略
 * @Author: whx
 * @Create: 2019-03-31 21:05
 **/
public class GroupbuyStrategy implements PromotionStrategy {
	
	public void doPromotion() {
		System.out.println("拼团，满20人成团，全团享受团购价");
	}
}
