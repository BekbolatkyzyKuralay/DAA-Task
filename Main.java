package org.example;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== BST Test ===");

        BST tree = new BST();

        tree.insert(10);
        tree.insert(5);
        tree.insert(15);
        tree.insert(3);
        tree.insert(7);

        System.out.println("Search 7: " + tree.search(7));
        System.out.println("Search 20: " + tree.search(20));

        tree.delete(5);

        System.out.println("After deleting 5:");
        System.out.println("Search 5: " + tree.search(5));
        System.out.println("Search 7: " + tree.search(7));


        System.out.println();
        System.out.println("=== Hash Table Test ===");

        HashTable hashTable = new HashTable(10);

        hashTable.insert(25);
        hashTable.insert(15);
        hashTable.insert(7);
        hashTable.insert(30);

        System.out.println("Search 25: " + hashTable.search(25));
        System.out.println("Search 100: " + hashTable.search(100));

        hashTable.delete(25);

        System.out.println("After deleting 25:");
        System.out.println("Search 25: " + hashTable.search(25));
        System.out.println("Search 15: " + hashTable.search(15));
    }
}