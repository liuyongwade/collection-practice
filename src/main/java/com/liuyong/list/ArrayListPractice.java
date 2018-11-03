package com.liuyong.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPractice {
	public static void method1() {
		List<String> list = new ArrayList<String>();
		list.add("James");
		list.add("Wade");
		list.add("Kobe");
		list.add("Curry");
		System.out.println(list.toString());

		list.add(1, "Harden");
		System.out.println(list.toString());

		String value = list.get(list.size() - 1);
		System.out.println("list最后一个值：" + value);

		value = list.get(3);
		System.out.println("list第三个值：" + value);

		System.out.println("list是否为空?" + list.isEmpty());

		System.out.println("是否包含Kobe?" + list.contains("Kobe"));
		list.remove("Kobe");
		System.out.println(list.toString());
		System.out.println("是否包含Kobe?" + list.contains("Kobe"));

		System.out.println(list.toString());
		List<String> sonList = new ArrayList<String>();
		list.addAll(sonList);
		System.out.println(list.toString());
	}
}
