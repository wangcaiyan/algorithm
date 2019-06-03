package algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * 编写一个递归函数来计算列表中包含的元素数
 * 
 * @author wangcaiyan[wang_cy1@suixingpay.com]
 *
 */
public class ListSizeByFactorail {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("1");
		list.add("8");
		list.add("9");
		list.add("k");
		int size = listSize(list);
		System.out.println("list数组包含元素个数是" + size);
	}

	public static int listSize(List<String> list) {
		list.size();
		// 基线条件数组为空
		if (null == list || list.isEmpty() ) {
			return 0;
		}
		list.remove(0);
		return 1 + listSize(list);
	}

}
