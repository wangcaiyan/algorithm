package algorithm;

/**
 * 使用递归计算数组之和
 * @author wangcaiyan[wang_cy1@suixingpay.com]
 *
 */
public class ArraySumByFactorial {

	public static void main(String[] args) {
		int[] array = {55, 5, 4};
		int sum = sumArray(array, 0);
		System.out.println("数组总和是" + sum);
	}
	
	public static int sumArray(int[] array, int index) {
		if (null == array || index > array.length - 1) {
			return 0;
		}
		return array[index] + sumArray(array, ++index);
	}
}
