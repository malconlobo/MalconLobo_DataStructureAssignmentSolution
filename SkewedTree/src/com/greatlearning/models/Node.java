package com.greatlearning.models;

//import com.greatlearning.main.Node;

public class Node {
	public int data;
	public Node left, right;

	public Node(int val) {
		data = val;
		left = right = null;
	}
}
