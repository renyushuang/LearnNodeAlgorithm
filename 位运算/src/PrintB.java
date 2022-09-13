/**
 * @author renyushuang 打印二进制
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

	}
}
