package com.greatlearning.services;

import com.greatlearning.models.*;
import java.util.*;

public class BstOperations {

	public ArrayList<Integer> arrayList = new ArrayList<>();

	private void inOrder(Node node) {
		// TODO Auto-generated method stub
		if (node == null) {
			return;
		}

		inOrder(node.left);
		arrayList.add(node.data);
		inOrder(node.right);
		return;

	}

	public Node modifyTree(Node node) {
		// TODO Auto-generated method stub
		/*
		 * First inorder traversal is done and results
		 * are placed in arrayList
		 * Then insertNode method is called to
		 * create a new BST which will be skewed
		 */
		inOrder(node);
		Node rootNode = null;
		for (int i = 0; i < arrayList.size(); i++) {
			rootNode = insertNode(arrayList.get(i), rootNode);
		}
		return rootNode;
	}

	private Node insertNode(int data, Node node) {
		// TODO Auto-generated method stub
		if (node == null) {
			Node newNode = new Node(data);
			return newNode;
		}

		if (data < node.data) {
			node.left = insertNode(data, node.left);
		} else if (data > node.data) {
			node.right = insertNode(data, node.right);
		}

		return node;
	}

	public void printTree(Node node) {
		/*
		 * Level order traversal of tree
		 * First get the height of the tree and
		 * then print the nodes at each level
		 */
		int height = getHeight(node);
		for(int i = 1; i <= height; i++) {
			printLevel(i,node);
		}
	}

	private void printLevel(int level, Node node) {
		// TODO Auto-generated method stub
		if(node == null) {
			return;
		}
		if(level == 1) {
			System.out.print(node.data + " ");
		}
		if(level > 1) {
			printLevel(level - 1, node.left);
			printLevel(level - 1, node.right);
		}
		
	}

	private int getHeight(Node node) {
		// TODO Auto-generated method stub
		if (node == null) {
			return 0;
		}
		
		int lheight = getHeight(node.left);
		int rheight = getHeight(node.right);
		
		if(lheight > rheight) {
			return lheight + 1;
		}
		else {
			return rheight + 1;
		}
	}

}
