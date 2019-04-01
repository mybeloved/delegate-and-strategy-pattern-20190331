import org.apache.commons.lang3.StringUtils;
import strategypattern.promotion.CashbackStrategy;
import strategypattern.promotion.CouponStrategy;
import strategypattern.promotion.PromotionActivity;

/**
 * @Program: delegate-and-strategy-pattern-20190331
 * @Description: 静态策略模式测试类
 * @Author: whx
 * @Create: 2019-03-31 21:05
 **/
public class StaticPromotionActivityTest {
	public static void main(String[] args) {
		PromotionActivity activity618 = new PromotionActivity(new CouponStrategy());
		PromotionActivity activity1111 = new PromotionActivity(new CashbackStrategy());
		
		activity618.execute();
		activity1111.execute();
	}
}
