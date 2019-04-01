package strategypattern.promotion;
/**
 * @Program: delegate-and-strategy-pattern-20190331
 * @Description: 无优惠策略
 * @Author: whx
 * @Create: 2019-03-31 21:05
 **/
public class EmptyStrategy implements PromotionStrategy {
    public void doPromotion() {
        System.out.println("无促销活动");
    }
}
