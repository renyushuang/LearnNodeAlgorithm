package 数学;

/**
 * 
 * @author renyushuang N的阶乘相加
 *
 *         1！+2！+3！+....N!
 */
public class NFactorialSum {

	public static void main(String[] args) {
			
//		1		1
//		1*2		2
//		1*2*3	6
//		1*2*3*4 24
		
		System.out.println(nFactorialSum(1));
		System.out.println(nFactorialSum(2));
		System.out.println(nFactorialSum(3));
		System.out.println(nFactorialSum(4));
	}

	private static int nFactorialSum(int n) {
		int last = 1;
		int res= 0;
		for (int i = 1; i <= n; i++) {
			last = i*last;
			res = last+res;
		}
		
		return res;
	}

}
