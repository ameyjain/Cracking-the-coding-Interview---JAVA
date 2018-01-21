package com.example.Practice;

/**
 * Java program to check is binary tree is symmetric or not
 */

public class IsMirroredTree {

    private static class Node {

        int key;
        Node left, right;

        Node(int item) {
            key = item;
            left = right = null;
        }
    }

	private static boolean isMirror(Node node1, Node node2) {

		// if both trees are empty, then they are mirror image
		if (node1 == null && node2 == null) {
			return true;
		}

		if (node1 != null && node2 != null && node1.key == node2.key) {
			return (isMirror(node1.left, node2.right)
					&& isMirror(node1.right, node2.left));
		}

		return false;
	}

	private static boolean isSymmetric(Node node) {

		// check if tree is mirror of itself
		return isMirror(node, node);
	}

	public static void main(String[] args) {

        Node root = new Node(1);
		root.left = new Node(2);
        root.right = new Node(2);
		root.left.left = new Node(3);
		root.left.right = new Node(4);
		root.right.left = new Node(4);
		root.right.right = new Node(3);
		boolean output = isSymmetric(root);

		if (output) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

}
