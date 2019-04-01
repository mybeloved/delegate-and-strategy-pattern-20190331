import strategypattern.pay.MsgResult;
import strategypattern.pay.Order;
import strategypattern.pay.payport.PayStrategy;

/**
 * @Program: delegate-and-strategy-pattern-20190331
 * @Description: 支付策略模式测试类
 * @Author: whx
 * @Create: 2019-03-31 21:05
 **/
public class PayStrategyTest {
	
	public static void main(String[] args) {
		
		//省略把商品添加到购物车，再从购物车下单
		//直接从点单开始
		Order order = new Order("1", "20180331213322", 324.45);
		
		//开始支付，选择微信支付、支付宝、银联卡、京东白条、财付通
		//每个渠道它支付的具体算法是不一样的
		//基本算法固定的
		
		//这个值是在支付的时候才决定用哪个值
		MsgResult result = order.pay(PayStrategy.ALI_PAY);
		System.out.println(result);
		
		
		
	}
	
}
