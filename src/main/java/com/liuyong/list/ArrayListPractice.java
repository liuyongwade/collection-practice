package com.liuyong.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListPractice {
	// 测试基本方法
	public static void method1() {
		List<String> playerList = new ArrayList<String>(3);
		// 添加
		playerList.add("James");
		playerList.add("Wade");
		playerList.add("Kobe");
		playerList.add("Curry");
		System.out.println(playerList.toString());
		System.out.println("------------------------");

		// 指定下标位置添加
		playerList.add(1, "Harden");
		System.out.println(playerList.toString());
		System.out.println("------------------------");

		// 个数
		System.out.println("球员人数：" + playerList.size());
		// 获取指定位置的元素
		String value = playerList.get(playerList.size() - 1);
		System.out.println("playerList最后一个值：" + value);
		System.out.println("------------------------");
		// 获取指定位置的元素
		value = playerList.get(3);
		System.out.println("playerList 下标为3的值：" + value);
		System.out.println("------------------------");

		// 判断List是否为空
		System.out.println("playerList是否为空?" + playerList.isEmpty());
		System.out.println("------------------------");

		// 是否包含某个元素
		System.out.println("是否包含Kobe?" + playerList.contains("Kobe"));
		playerList.remove("Kobe");
		System.out.println(playerList.toString());
		System.out.println("是否包含Kobe?" + playerList.contains("Kobe"));
		System.out.println("------------------------");

		System.out.println(playerList.toString());
		List<String> otherPlayerList = new ArrayList<String>();
		otherPlayerList.add("JemeryLin");
		otherPlayerList.add("YaoMing");
		otherPlayerList.add("TMac");
		otherPlayerList.add("AllenIverson");
		// 添加集合
		playerList.addAll(otherPlayerList);
		System.out.println(playerList.toString());
	}

	// 测试构造方法
	public static void method2() {
		// 无参构造
		List<Integer> list1 = new ArrayList<Integer>();
		System.out.println(list1);
		// 指定长度的构造方法
		List<String> list2 = new ArrayList<String>(20); // 设置负数
		// 复制指定Collection的数值到新数组中
		List<String> list3 = new ArrayList<String>(Arrays.asList("11", "22"));
		System.out.println(list3);
	}

	public static void method3() {
		ArrayList<String> playerList = new ArrayList<String>(3);
		playerList.add("James");
		playerList.add("Wade");
		playerList.add("Kobe");
		playerList.add("Curry");
		System.out.println(playerList.toString());
		System.out.println("------------------------");

		// 获取指定元素下标
		int indexJames = playerList.indexOf("James");
		System.out.println("James的下标：" + indexJames);
		int indexKobe = playerList.indexOf("Kobe");
		System.out.println("Kobe的下标：" + indexKobe);
		int indexCarter = playerList.indexOf("Carter");
		System.out.println("Carter的下标：" + indexCarter);
		System.out.println("------------------------");

		// 克隆
		ArrayList<String> cloneList = (ArrayList<String>) playerList.clone();
		System.out.println(cloneList);
		cloneList.add("ONeal");
		System.out.println(cloneList);
		System.out.println(playerList);
		System.out.println("------------------------");

		// List转化成数组
		Object[] players = playerList.toArray();
		for (Object obj : players) {
			System.out.print(obj + "");
		}
		System.out.println();
		// 转化为数组后，下标为size()用null表示，区别于之前的数组
		// String[] tmpArr =new String[10];
		String[] tmpArr = { "1", "2", "3", "4", "5", "6", "7", "8" };
		playerList.toArray(tmpArr);
		for (String tmp : tmpArr) {
			System.out.print(tmp + " ");
		}
		System.out.println();
		System.out.println("------------------------");

		// 指定位置赋值
		playerList.set(1, "Paul");
		System.out.println(playerList);
		// 越界，就报IndexOutOfBoundsException
		playerList.set(8, "Durant");
		System.out.println(playerList);
	}

	public static void method4() {
		ArrayList<String> playerList = new ArrayList<String>(3);
		playerList.add("James");
		playerList.add("Wade");
		playerList.add("Kobe");
		playerList.add("Curry");
		System.out.println(playerList.toString());

		// 保留指定集合中的元素，（交集）
		List<String> retainList = new ArrayList<String>(3);
		retainList.add("James");
		retainList.add("liuyong");
		playerList.retainAll(retainList);
		System.out.println(playerList);

		// 删除指定集合中的元素
		playerList.clear();
		playerList.add("James");
		playerList.add("Wade");
		playerList.add("Kobe");
		playerList.add("Curry");
		System.out.println(playerList.toString());
		List<String> removeList = new ArrayList<String>(3);
		removeList.add("Wade");
		removeList.add("liuyong");
		playerList.removeAll(removeList);
		System.out.println(playerList);
		System.out.println("------------------------");
	}

	public static void method5() {
		ArrayList<String> playerList = new ArrayList<String>(3);
		playerList.add("James");
		playerList.add("Wade");
		playerList.add("Kobe");
		playerList.add("Curry");
		System.out.println(playerList.toString());
		
		Iterator<String> iter = playerList.iterator();
		while(iter.hasNext()) {
			System.out.print(iter.next() + " ");
		}
		System.out.println();
		
		ListIterator<String> listIter = playerList.listIterator();
		while(listIter.hasNext()) {
			System.out.print(listIter.next() + " ");
		}
		System.out.println();
		while(listIter.hasPrevious()) {
			System.out.print(listIter.previous() + " ");
		}
		System.out.println("");
		
		List<String> subList = playerList.subList(2, 3);
		System.out.println(subList);
	}
}
