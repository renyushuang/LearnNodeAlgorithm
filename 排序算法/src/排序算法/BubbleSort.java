package 排序算法;

public class BubbleSort {
	public static void main(String[] args) {
		int[] a = { 4, 1, 5, 7, 3, 5, 3 };

		print(a);
		bubbleSort(a);
		print(a);

	}	
	
	/**
	 * 
	 * @param a 选择排序 选择最小的放到前面
	 */
	private static void print(int a[]) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ",");
		}
		System.out.println();
	}
	// 冒泡
	private static void bubbleSort(int[] a) {
		int N = a.length;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N - 1; j++) {
				if (a[j] > a[j + 1]) {
					swap(a, j, j + 1);
				}
			}
		}

	}

	private static void swap(int[] a, int j, int i) {
		// TODO Auto-generated method stub
		int temp = a[j];
		a[j] = a[i];
		a[i] = temp;
	}


}
