package algorithm;

/**
 * 快速排序, 将数组按从小到大排序,for循环版
 * 
 * @author wangcaiyan[wang_cy1@suixingpay.com]
 *
 */
public class FastSort {

	public static void main(String[] args) {

		int[] array = { 5, 1, 2, 9, 9, 3 };
		int[] sortArray = fastSort(array, 0, 5);
		for (int i = 0; i < sortArray.length; i++) {
			System.out.println(sortArray[i] + ",");
		}

	}

	public static int[] fastSort(int[] array, int left, int right) {
		if (null == array || 1 == array.length) {
			return array;
		}
		if (left > right) {
			return array;
		}

		int initail = array[left];
		int i = 0;
		int j;
		for (j = right; j > i; j--) {
			if (initail > array[j]) {
				for (i = left; i < j; i++) {
					if (initail < array[i]) {
						int temp = array[i];
						array[i] = array[j];
						array[j] = temp;
						break;
					}
				}
				break;
			}
		}
		// 交换起始值，除初始值所在位置外，i所在的位置及左边都比初始值小，右边都是比初始值大的值，所以交换i和初始位置，
		// 则初始值左邊都比初始值小，右邊都比初始值大，然後分別對兩邊開始排序
		array[left] = array[i];
		array[i] = initail;

		fastSort(array, left, i - 1);
		fastSort(array, i + 1, right);
		return array;
	}

}
