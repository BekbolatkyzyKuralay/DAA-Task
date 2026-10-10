package org.example;

import java.util.LinkedList;

public class HashTable {

    private LinkedList<Integer>[] table;
    private int capacity;

    public HashTable(int capacity) {
        this.capacity = capacity;
        table = new LinkedList[capacity];

        for (int i = 0; i < capacity; i++) {
            table[i] = new LinkedList<>();
        }
    }

    private int hash(int value) {
        return Math.abs(value) % capacity;
    }

    public void insert(int value) {
        int index = hash(value);

        if (!table[index].contains(value)) {
            table[index].add(value);
        }
    }

    public boolean search(int value) {
        int index = hash(value);
        return table[index].contains(value);
    }

    public void delete(int value) {
        int index = hash(value);
        table[index].remove(Integer.valueOf(value));
    }
}