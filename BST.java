package org.example;

public class BST {

    private class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    private Node root;

    public void insert(int value) {
        root = insertRecursive(root, value);
    }

    private Node insertRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }

        if (value < current.data) {
            current.left = insertRecursive(current.left, value);
        } else if (value > current.data) {
            current.right = insertRecursive(current.right, value);
        }

        return current;
    }

    public boolean search(int value) {
        return searchRecursive(root, value);
    }

    private boolean searchRecursive(Node current, int value) {
        if (current == null) {
            return false;
        }

        if (value == current.data) {
            return true;
        }

        if (value < current.data) {
            return searchRecursive(current.left, value);
        } else {
            return searchRecursive(current.right, value);
        }
    }

        public void delete ( int value){
            root = deleteRecursive(root, value);
        }

        private Node deleteRecursive (Node current,int value){
            if (current == null) {
                return null;
            }

            if (value < current.data) {
                current.left = deleteRecursive(current.left, value);
            } else if (value > current.data) {
                current.right = deleteRecursive(current.right, value);
            } else {

                if (current.left == null && current.right == null) {
                    return null;
                }

                if (current.left == null) {
                    return current.right;
                }

                if (current.right == null) {
                    return current.left;
                }

                int smallestValue = findSmallestValue(current.right);
                current.data = smallestValue;
                current.right = deleteRecursive(current.right, smallestValue);
            }

            return current;
        }

        private int findSmallestValue (Node root){
            if (root.left == null) {
                return root.data;
            }

            return findSmallestValue(root.left);
        }
    }