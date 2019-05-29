package algorithm;

/**
 * 欧几里得算法:求两数的最大公约数,两个整数的最大公约数等于其中较小的那个数和两数相除余数的最大公约数
 * 
 * @author wangcaiyan[wang_cy1@suixingpay.com]
 *
 */
public class GCD {

	public static void main(String[] args) {
		int i = 5;
		int j = 33;
		int gcd = gcd(i, j);
		System.out.println(i + "和" + j + "的最大公约数是" + gcd);

	}

	/**
	 * 大数除以小数
	 * 
	 * @param i
	 * @param j
	 * @return
	 */
	private static int gcd(int i, int j) {
		// 基线条件：两数可以整除，则那个小值就是最大公约数
		if (i % j == 0) {
			return j;
		} else {
			return gcd(j, i % j);
		}
	}

}
