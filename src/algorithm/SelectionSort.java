package algorithm;

/**
 * 选择排序
 * 
 * @author wangcaiyan[wang_cy1@suixingpay.com]
 *
 */
public class SelectionSort {

	public static void main(String[] args) {
		int[] array = { 12, 34, 56, 2, 8, 65, 2 };
		int[] sortArray = selectionSort(array);
		System.out.println("排序后的序列" + sortArray);
	}

	/**
	 * 从大到小 选择排序
	 * 
	 * @param array
	 * @return
	 */
	private static int[] selectionSort(int[] array) {
		if (null == array) {
			return array;
		}

		for (int j = 0; j < array.length; j++) {
			int maxIndex = j;
			int max = array[j];
			int i;
			for (i = j; i < array.length; i++) {
				if (max < array[i]) {
					max = array[i];
					maxIndex = i;
				}
			}
			int temp = array[j];
			array[j] = array[maxIndex];
			array[maxIndex] = temp;
			System.out.println("第" + j + "位是" + array[j]);
		}

		return array;
	}

}
