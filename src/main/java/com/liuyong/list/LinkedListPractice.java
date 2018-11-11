package com.liuyong.list;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class LinkedListPractice {
	public static void method1() {
		LinkedList<String> foodsList = new LinkedList<String>();
		foodsList.add("苹果");
		foodsList.add("香蕉");
		foodsList.add("芒果");
		foodsList.add("葡萄");
		foodsList.add("梨");

		System.out.println("水果种类：" + foodsList);
		System.out.println("水果种类数量：" + foodsList.size());

		foodsList.remove("苹果");
		foodsList.remove(3);
		Iterator<String> iter = foodsList.iterator();
		while (iter.hasNext()) {
			System.out.print(iter.next() + " ");
		}
		System.out.println();
	}

	// Queue操作:单向队列(LILO,先进先出),从前面删除元素，从后面插入元素，跟现实中排队是一样的道理
	public static void method2() {
		Queue<String> userQueue = new LinkedList<String>();
		userQueue.add("小明");
		userQueue.add("小红");
		userQueue.add("小王");
		userQueue.add("小吴");
		System.out.println(userQueue);
		System.out.println(userQueue.peek());
		System.out.println(userQueue);

		System.out.println(userQueue.poll());
		System.out.println(userQueue);

		// 获取列表头元素
		String element = userQueue.element();
		System.out.println(element);
		// 删除列表头元素
		String removeValue = userQueue.remove();
		System.out.println(removeValue);
		System.out.println(userQueue);
	}

	// Deque操作:双向队列
	// Deque接口是double ended queue的缩写，即双端队列，支持在队列的两端插入和删除元素，继承Queue接口。
	public static void method3() {
		Deque<String> bookDeque = new LinkedList<String>();
		bookDeque.add("Java集合");
		bookDeque.addFirst("Springboot");
		bookDeque.addLast("Spring");
		bookDeque.add("Java多线程");
		System.out.println(bookDeque);

		System.out.println(bookDeque.contains("Java多线程"));

		bookDeque.removeLast();
		System.out.println(bookDeque);

		System.out.println(bookDeque.removeFirst());
		System.out.println(bookDeque);

		bookDeque.offerLast("Shiro");
		bookDeque.offerFirst("Oracle");
		bookDeque.offer("Swagger");
		System.out.println(bookDeque);

		bookDeque.push("SpringCloud");
		System.out.println(bookDeque);

	}
}
