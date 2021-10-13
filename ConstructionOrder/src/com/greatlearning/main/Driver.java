package com.greatlearning.main;
import java.util.*;
import com.greatlearning.services.*;

public class Driver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the total no of floors in the building");
		int size = sc.nextInt();
		ArrayList<Integer> arrayList = new ArrayList<>();
		for(int i = 0; i < size; i++) {
			System.out.println("Enter the floor size given on day : " + (i+1));
			arrayList.add(sc.nextInt());
		}
		FloorOrder floorOrder = new FloorOrder();
		floorOrder.getOrder(arrayList);
		sc.close();
	}
	
}
