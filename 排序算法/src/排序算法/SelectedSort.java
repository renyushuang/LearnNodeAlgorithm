package 排序算法;

public class SelectedSort {

	public static void main(String[] args) {
		int[] a = { 4, 1, 5, 7, 3, 5, 3 };

		print(a);
		sort(a);
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

	private static void sort(int a[]) {
		for (int i = 0; i < a.length; i++) {
			int minIndex = i;
			for (int j = i; j < a.length; j++) {
				if (a[j] < a[minIndex]) {
					minIndex = j;
				}
			}
			if (minIndex != i) {
				swap(a, i, minIndex);
			}
		}
	}

	private static void swap(int[] a, int i, int minIndex) {
		int temp = a[i];
		a[i] = a[minIndex];
		a[minIndex] = temp;
	}

}
