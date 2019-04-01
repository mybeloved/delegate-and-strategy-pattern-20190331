import org.apache.commons.lang3.StringUtils;
import strategypattern.promotion.CashbackStrategy;
import strategypattern.promotion.CouponStrategy;
import strategypattern.promotion.PromotionActivity;

/**
 * @Program: delegate-and-strategy-pattern-20190331
 * @Description: 动态策略模式测试类
 * @Author: whx
 * @Create: 2019-03-31 21:05
 **/
public class DynamicPromotionActivityTest {
	public static void main(String[] args) {
		
		PromotionActivity promotionActivity = null;
		
		String promotionKey = "COUPON";
		
		if (StringUtils.equals(promotionKey, "COUPON")) {
			promotionActivity = new PromotionActivity(new CouponStrategy());
		} else if (StringUtils.equals(promotionKey, "CASHBACK")) {
			promotionActivity = new PromotionActivity(new CashbackStrategy());
		}
		
		//......
		
		promotionActivity.execute();
	}
	
}
