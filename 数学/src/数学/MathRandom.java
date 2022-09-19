package 数学;

public class MathRandom {

	public static void main(String[] args) {

	}

	/**
	 * 返回一个[0,1) 随机数 让任意位置的概率为 x的平方
	 */
	public static void xToXPower2() {
		Math.max(Math.random(), Math.random());
	}

	/**
	 * 1-5 随机 1-7
	 * 
	 * 解法
	 *  1-5得到 0-1的随机 
	 *  0-7相当于 二进制 随机三次 （<<每次向左移动两位）
	 *  0-6 当遇到7的时候就重做
	 *  
	 */
	public static void Random1() {


	}
	
	
	/**
	 *  0,1是等概概率的，但是0的概率是固定的，1的概率也是固定的
	 *  返回等概率的0,1
	 * 
	 * 解法
	 *  随机两次，如果两次相同，就重做
	 *  
	 */
	public static void Random2() {


	}

}
