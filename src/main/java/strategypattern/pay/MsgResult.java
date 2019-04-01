package strategypattern.pay;

/**
 * @Program: delegate-and-strategy-pattern-20190331
 * @Description: 支付结果
 * @Author: whx
 * @Create: 2019-03-31 21:05
 **/
public class MsgResult {
	private int code;
	private String msg;
	private Object data;
	
	public MsgResult(int code, String msg, Object data) {
		this.code = code;
		this.msg = msg;
		this.data = data;
	}
	
	public String toString() {
		return ("支付状态：[" + code + "]," + msg + ",交易详情：" + data);
	}
}
