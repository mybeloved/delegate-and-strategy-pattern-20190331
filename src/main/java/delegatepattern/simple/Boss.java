package delegatepattern.simple;

/**
 * @Program: delegate-and-strategy-pattern-20190331
 * @Description: 老板
 * @Author: whx
 * @Create: 2019-03-31 21:05
 **/
public class Boss {
	
	public void command(String command, Leader leader) {
		leader.doing(command);
	}
	
}

