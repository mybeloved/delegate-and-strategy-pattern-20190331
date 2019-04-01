package delegatepattern.simple;

/**
 * @Program: delegate-and-strategy-pattern-20190331
 * @Description: 员工A
 * @Author: whx
 * @Create: 2019-03-31 21:05
 **/
public class EmployeeA implements IEmployee {
	public void doing(String command) {
		System.out.println("我是员工A，我现在开始干" + command + "工作");
	}
}
