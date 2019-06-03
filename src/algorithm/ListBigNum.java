package algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * 使用递归找出列表中最大的数字
 * 
 * @author wangcaiyan[wang_cy1@suixingpay.com]
 *
 */
public class ListBigNum {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(); 
		list.add(12);
		list.add(1299);
		list.add(99);
		list.add(129);
		int bigNum = getBigNumByFactorail(list, 0);
		System.out.println("最大的数字是:" + bigNum);

	}

	private static int getBigNumByFactorail(List<Integer> list, int bigNum) {
		// 基线条件：list为空或者是list最后一位
		if (null == list || list.isEmpty()) {
			return bigNum;
		}
		if (bigNum < list.get(0)) {
			bigNum = list.get(0);
		}
		list.remove(0);
		return getBigNumByFactorail(list, bigNum);
	}
}
