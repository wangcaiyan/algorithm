package algorithm;

/**
 * 递归计算阶乘
 * 
 * @author wangcaiyan
 *
 */
public class Factorial {

	public static void main(String[] args) {

		int num = 5;
		int result = factorial(num);
		System.out.println(num + "的阶乘是" + result);

	}

	/**
	 * 递归计算阶乘
	 * 
	 * @param num
	 * @param result
	 * @return
	 */
	public static int factorial(int num) {
		if (0 < num) {
			return num * factorial(num - 1);
		} else {
			return 1;
		}
	}
	
	/**
	 * 递归计算阶乘
	 * 
	 * @param num
	 * @param result
	 * @return
	 */
	public static int factorial2(int num) {
		if (1 == num) {
			return 1;
		} else {
			return num * factorial(num - 1);
		}
	}

}
