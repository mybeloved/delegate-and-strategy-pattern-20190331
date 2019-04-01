import org.apache.commons.lang3.StringUtils;
import strategypattern.promotion.CashbackStrategy;
import strategypattern.promotion.CouponStrategy;
import strategypattern.promotion.PromotionActivity;
import strategypattern.promotion.PromotionStrategyFactory;

/**
 * @Program: delegate-and-strategy-pattern-20190331
 * @Description: 策略模式工厂测试类
 * @Author: whx
 * @Create: 2019-03-31 21:05
 **/
public class PromotionActivityFactoryTest {
	
	public static void main(String[] args) {
		
		String promotionKey = "GROUPBUY";
		PromotionActivity promotionActivity = new PromotionActivity(PromotionStrategyFactory.getPromotionStrategy(promotionKey));
		promotionActivity.execute();
		
	}
	
}
