package 二分法;

import java.util.Arrays;

public class Dichotomize {

	public static void main(String[] args) {
//		int arr[] = { 1, 34, 5, 6, 7, 8, 6, 9 };
//		Arrays.sort(arr);
//		int index = find(arr, 6);
//		System.out.println("index = " + index);
//		System.out.println("index value = " + arr[index]);
//		System.out.println("-----------------------------");

		int arr1[] = { 1, 2, 2, 2, 4, 5, 6, 7 };
		int index1 = find1(arr1, 2);
		System.out.println("index1 = " + index1);
		System.out.println("index1 value = " + arr1[index1]);
		System.out.println("-----------------------------");
	}

	// 有序数组中 找一个数
	public static int find(int[] arr, int num) {

		int left = 0;
		int right = arr.length - 1;

		while (left <= right) {
			int mid = (left + right) / 2;

			if (arr[mid] == num) {
				return mid;
			} else if (arr[mid] < num) {
				left = mid;
			} else {
				right = mid;
			}
		}

		return -1;
	}

	// 在有序数组中找到 > num 最左的位置
	// 解法 二分法 保存最大的值
	public static int find1(int[] arr, int num) {
		int left = 0;
		int right = arr.length - 1;
		int res = -1;
		while (left < right) {
			int mid = (left + right) / 2;

			if (arr[mid] > num) {
				res = mid;
				right = mid;
			} else if (arr[mid] < num) {
				left = mid;
			} else {
				left = mid + 1;
			}
		}

		return res;
	}

	/**
	 * 局部最小值问题 ， 无序 任意两个相邻的数不想等 [0]<[1] 0局部最小 [n-1]>[n-2] n-1 局部最小 左 > i < 右 局部最小
	 * 
	 * @param arr
	 * @param num
	 * @return
	 */
	public static int find2(int[] arr, int num) {
		// 1.[0]>[1] [N-1]>[N-2] 左边是下降的 ， 右边是上升的 那么一定存在局部最小，画图就能看出来
		// 2.找到 mid 如果mid是局部上扬的，那么和第一种情况是差不多的，必有局部最小
		int N = arr.length;
		if (N == 1) {
			return 0;
		}
		if (arr[0] < arr[1]) {
			return 0;
		}

		if (arr[N - 1] > arr[N - 2]) {
			return arr[N - 1];
		}

		int left = 0;
		int right = N - 1;
		int res = -1;
		while (left < right) {
			int mid = (left + right) / 2;
			if (arr[mid] < arr[mid - 1] && arr[mid] > arr[mid + 1]) {
				res = mid;
				break;
			}
			if (arr[mid] > arr[mid - 1]) {
				right = mid - 1;
				continue;
			}

			if (arr[mid] < arr[mid + 1]) {
				left = mid + 1;
				continue;
			}
		}

		return res;
	}

}
