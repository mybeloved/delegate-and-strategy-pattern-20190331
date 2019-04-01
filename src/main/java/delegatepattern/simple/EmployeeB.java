package delegatepattern.simple;

/**
 * @Program: delegate-and-strategy-pattern-20190331
 * @Description: 员工B
 * @Author: whx
 * @Create: 2019-03-31 21:05
 **/
public class EmployeeB implements IEmployee {
	public void doing(String command) {
		System.out.println("我是员工B，我现在开始干" + command + "工作");
	}
}
