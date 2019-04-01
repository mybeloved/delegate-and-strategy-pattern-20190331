package strategypattern.pay.payport;


/**
 * @Program: delegate-and-strategy-pattern-20190331
 * @Description: 支付宝支付策略
 * @Author: whx
 * @Create: 2019-03-31 21:05
 **/
public class AliPay extends Payment {

    public String getName() {
        return "支付宝";
    }

    protected double queryBalance(String uid) {
        return 900;
    }

}
