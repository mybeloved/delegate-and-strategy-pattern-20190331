package strategypattern.promotion;

import java.util.HashMap;
import java.util.Map;

/**
 * @Program: delegate-and-strategy-pattern-20190331
 * @Description: 促销策略工厂
 * @Author: whx
 * @Create: 2019-03-31 21:05
 **/
public class PromotionStrategyFactory {
	private static Map<Enum, PromotionStrategy> PROMOTION_STRATEGY_MAP = new HashMap<Enum, PromotionStrategy>();
	
	static {
		PROMOTION_STRATEGY_MAP.put(PromotionKey.COUPON, new CouponStrategy());
		PROMOTION_STRATEGY_MAP.put(PromotionKey.CASHBACK, new CashbackStrategy());
		PROMOTION_STRATEGY_MAP.put(PromotionKey.GROUPBUY, new GroupbuyStrategy());
	}
	
	private static final PromotionStrategy NON_PROMOTION = new EmptyStrategy();
	
	private PromotionStrategyFactory() {
	}
	
	public static PromotionStrategy getPromotionStrategy(String promotionKey) {
		PromotionStrategy promotionStrategy = PROMOTION_STRATEGY_MAP.get(PromotionKey.valueOf(promotionKey));
		return promotionStrategy == null ? NON_PROMOTION : promotionStrategy;
	}
	
	private enum PromotionKey {
		COUPON, CASHBACK, GROUPBUY
	}
	
}
