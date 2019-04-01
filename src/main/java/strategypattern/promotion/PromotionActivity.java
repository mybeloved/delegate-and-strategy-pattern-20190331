package strategypattern.promotion;

/**
 * @Program: delegate-and-strategy-pattern-20190331
 * @Description: 优惠活动总策略
 * @Author: whx
 * @Create: 2019-03-31 21:05
 **/
public class PromotionActivity {
	private PromotionStrategy promotionStrategy;
	
	public PromotionActivity(PromotionStrategy promotionStrategy) {
		this.promotionStrategy = promotionStrategy;
	}
	
	public void execute() {
		promotionStrategy.doPromotion();
	}
	
}
