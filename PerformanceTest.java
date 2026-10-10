package org.example;

import java.util.Random;

public class PerformanceTest {

    public static void main(String[] args) {

        int[] sizes = {100, 1000, 10000};

        for (int size : sizes) {
            test(size);
        }
    }

    private static void test(int size) {

        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            numbers[i] = i;
        }

        shuffle(numbers);

        System.out.println("\n==============================");
        System.out.println("Number of elements: " + size);
        System.out.println("==============================");

        testBST(numbers);
        testHashTable(numbers);
    }

    private static void testBST(int[] numbers) {

        BST tree = new BST();

        long start = System.nanoTime();

        for (int number : numbers) {
            tree.insert(number);
        }

        long end = System.nanoTime();
        long insertTime = end - start;


        start = System.nanoTime();

        for (int number : numbers) {
            tree.search(number);
        }

        end = System.nanoTime();
        long searchTime = end - start;


        start = System.nanoTime();

        for (int number : numbers) {
            tree.delete(number);
        }

        end = System.nanoTime();
        long deleteTime = end - start;


        System.out.println("BST:");
        System.out.println("Insertion time: " + insertTime + " ns");
        System.out.println("Search time: " + searchTime + " ns");
        System.out.println("Deletion time: " + deleteTime + " ns");
    }

    private static void testHashTable(int[] numbers) {

        HashTable hashTable = new HashTable(numbers.length * 2);

        long start = System.nanoTime();

        for (int number : numbers) {
            hashTable.insert(number);
        }

        long end = System.nanoTime();
        long insertTime = end - start;


        start = System.nanoTime();

        for (int number : numbers) {
            hashTable.search(number);
        }

        end = System.nanoTime();
        long searchTime = end - start;


        start = System.nanoTime();

        for (int number : numbers) {
            hashTable.delete(number);
        }

        end = System.nanoTime();
        long deleteTime = end - start;


        System.out.println("Hash Table:");
        System.out.println("Insertion time: " + insertTime + " ns");
        System.out.println("Search time: " + searchTime + " ns");
        System.out.println("Deletion time: " + deleteTime + " ns");
    }

    private static void shuffle(int[] numbers) {

        Random random = new Random();

        for (int i = numbers.length - 1; i > 0; i--) {

            int j = random.nextInt(i + 1);

            int temp = numbers[i];
            numbers[i] = numbers[j];
            numbers[j] = temp;
        }
    }
}