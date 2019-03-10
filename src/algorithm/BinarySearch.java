package algorithm;

/**
 * 二分查找:适用于在有序的列表中查找指定元素,二分查找最大时间复杂度为：O(logn)
 * 
 * @author wangcaiyan[wang_cy1@suixingpay.com]
 *
 */
public class BinarySearch {
	
	private static int count = 0; // 二分查找次数

	public static void main(String[] args) {
		
		int[] numArray = new int[11];
		for (int i = 0; i < numArray.length; i++) {
			numArray[i] = i + 1; // 为数组赋值
			System.out.println("numArray第" + i + "位为" + numArray[i]);
		}

		// 二分查找算法
		int num = 51;
		int numIndex = binarySearch(numArray, num);
		System.out.println("二分查找次数" + count);
		System.out.println("非递归二分查找" + numIndex);
		numIndex = binarySearchByRecursion(numArray, num, 0, numArray.length - 1);
		System.out.println("递归二分查找" + numIndex);
		if (0 > numIndex) {
			System.out.println("该值不存在");
			return;
		}
		System.out.println(num + "在数组的第" + numIndex + "位");
	}

	/**
	 * 非递归算法：使用二分查找num在数组的哪个位置
	 */
	private static int binarySearch(int[] numArray, int num) {
		int low = 0;
		int high = numArray.length - 1;
		while (low <= high) {
			count += 1;
			int middle = (high + low) / 2;
			if (num == numArray[middle]) {
				return middle;
			}
			if (num > numArray[middle]) {
				low = middle + 1;
			} else if (num < numArray[middle]) {
				high = middle - 1;
			}
		}
		return -1;
	}
	
	/**
	 * 使用递归算法实现二分查找
	 * @param numArray
	 * @param numKey
	 * @param low
	 * @param high
	 * @return
	 */
	private static int binarySearchByRecursion(int[] numArray, int numKey, int low, int high) {
		if (low > high) {
			return -1;
		}
		int middle = (low + high) / 2;
		if (numKey == numArray[middle]) {
			return middle;
		}
		if (numKey > numArray[middle]) {
			low = middle + 1;
			return binarySearchByRecursion(numArray, numKey, low, high);
		}
		if (numKey < numArray[middle]) {
			high = middle - 1;
			return binarySearchByRecursion(numArray, numKey, low, high);
		}
		return -1;
	}

}
