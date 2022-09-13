/**
 * @author renyushuang 打印二进制
 * 
 * 
 * 一个数左移动，那么当前数乘二
 * 
 * 整型的最高位是 用来判断 + - 
 * 
 */
public class PrintB {

	public static void print(int num) {
		for (int i = 31; i >= 0; i--) {
			System.out.print((num & (1 << i)) == 0 ? "0" : "1");

		}
		System.out.println();
	}

	public static void main(String[] args) {

		int num = 127148343;
		print(num);
		
		
		//11111111111111111111111111111111
		//1负数 不管了 后面去反+1
		print(-1);
		
		int c = 1212;
		int b = ~c;
		print(c);
		print(b);
		
		

	}
}
