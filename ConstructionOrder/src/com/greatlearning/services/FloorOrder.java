package com.greatlearning.services;

import java.util.*;

public class FloorOrder {

	public void getOrder(ArrayList<Integer> arrayList) {
		// TODO Auto-generated method stub
		Stack<Integer> stack = new Stack<>();
		int maxValue = Collections.max(arrayList);
		System.out.println("The order of construction is as follows");
		/*
		 * Traverse arrayList until maxValue is found 
		 * After that sort the elements in stack and
		 * Call recursive function to find if values present
		 * before maxValue in arrayList are in order
		 */
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println("Day: " + (i + 1));
			if (arrayList.get(i) == maxValue) {
				System.out.println(maxValue);
				Collections.sort(stack);
				/*
				 * Get new maxValue after previous maxValue is found
				 * For eg. if 10 was previous maxValue and order 8 9 10
				 * is found, then new maxValue will be 7
				 */
				maxValue = getFloor(stack, maxValue - 1);
			} else {
				stack.push(arrayList.get(i));
			}
		}
	}

	private int getFloor(Stack<Integer> stack, int maxValue) {
		// TODO Auto-generated method stub
		if (stack.isEmpty()) {
			return maxValue;
		}

		if (stack.peek() == maxValue) {
			System.out.println(stack.pop());
			return getFloor(stack, maxValue - 1);
		} else {
			return maxValue;
		}

	}

}
