package com.greatlearning.main;
import com.greatlearning.models.*;
import com.greatlearning.services.*;

public class Driver {

	public static void main(String[] args) {
        //Create nodes for tree
		Node node1 = new Node(50);
		Node node2 = new Node(30);
		Node node3 = new Node(60);
		Node node4 = new Node(10);
		Node node5 = new Node(40);
		
        //Make the parent child connections
		node1.left = node2;
		node1.right = node3;
		node2.left = node4;
		node2.right = node5;
		
		/*
		 * Logic is that inorder traversal of given tree
		 * results in ascending order of values.
		 * Now these values in ascending order if inserted in a new BST
		 * will result in right skewed tree as required 
		 */

		BstOperations bst = new BstOperations();
		System.out.println("Level order of original tree : ");
		bst.printTree(node1);
		node1 = bst.modifyTree(node1);
		System.out.println();
		System.out.println("Level order of modified tree : ");
		bst.printTree(node1);

	}
	
}
