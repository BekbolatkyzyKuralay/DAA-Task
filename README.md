# BST and Hash Table Performance Comparison

## Student
Bekbolatkyzy Kuralay

## Course
Design and Analysis of Algorithms

## Project Overview

The purpose of this project is to compare the performance of a Binary Search Tree and a Hash Table.

In this project, I implemented both data structures in Java and tested three main operations:

- insertion
- searching
- deletion

I tested both structures with 100, 1,000, and 10,000 elements. I measured the execution time by using System.nanoTime().

---

## Binary Search Tree

The Binary Search Tree stores elements in nodes.

For every node:

- smaller values go to the left side
- larger values go to the right side

The BST implementation has three main methods:

- insert()
- search()
- delete()

The performance of a BST depends on the shape of the tree. If the tree is balanced, operations are faster. If the tree becomes skewed, performance becomes worse.

---

## Hash Table

The Hash Table stores values by using a hash function.

In this project, I used separate chaining with LinkedList to handle collisions.

The hash function decides where the value should be stored.

The Hash Table also has three main methods:

- insert()
- search()
- delete()

Hash Tables are usually very fast because they can directly access a bucket by using the hash value.

---

## Time Complexity Analysis

### Binary Search Tree

Insertion:
- Best/Average case: O(log n)
- Worst case: O(n)

Searching:
- Best/Average case: O(log n)
- Worst case: O(n)

Deletion:
- Best/Average case: O(log n)
- Worst case: O(n)

The worst case happens when the BST becomes skewed, for example when values are inserted in sorted order.

### Hash Table

Insertion:
- Best/Average case: O(1)
- Worst case: O(n)

Searching:
- Best/Average case: O(1)
- Worst case: O(n)

Deletion:
- Best/Average case: O(1)
- Worst case: O(n)

The worst case can happen when many values produce the same hash index and create many collisions.

---

## Experimental Results

### 100 Elements

BST:
- Insertion: 766800 ns
- Search: 65000 ns
- Deletion: 64200 ns

Hash Table:
- Insertion: 256800 ns
- Search: 66300 ns
- Deletion: 91300 ns

### 1,000 Elements

BST:
- Insertion: 454900 ns
- Search: 298300 ns
- Deletion: 375200 ns

Hash Table:
- Insertion: 669400 ns
- Search: 466900 ns
- Deletion: 544200 ns

### 10,000 Elements

BST:
- Insertion: 3621600 ns
- Search: 2283200 ns
- Deletion: 3328800 ns

Hash Table:
- Insertion: 1308600 ns
- Search: 1034000 ns
- Deletion: 1071200 ns

---

## Results Comparison

The results were different for each input size.

For 100 elements, the Hash Table had faster insertion, but the BST had slightly faster searching and deletion.

For 1,000 elements, the BST was faster in all three operations in this experiment.

For 10,000 elements, the Hash Table became clearly faster than the BST in insertion, searching, and deletion.

The results show that execution time does not always follow theory exactly for small input sizes.

---

## Why Performance Can Be Different in Practice

There are several reasons why practical results can be different.

First, Java uses the JVM, and the JVM can optimize code while the program is running.

Second, the order of the input values can change the structure of the BST.

Third, Hash Table performance depends on collisions and the size of the table.

Also, the computer can run other programs at the same time, so execution time may slightly change between different runs.

---

## Conclusion

In this project, I compared a Binary Search Tree and a Hash Table.

The BST can work efficiently when the tree is balanced, but its worst-case performance can become O(n).

The Hash Table usually has O(1) average time for insertion, searching, and deletion, but collisions can reduce its performance.

From my experiment, the Hash Table showed better performance with 10,000 elements, while the BST was competitive with smaller input sizes.

This task helped me understand that theoretical complexity and real execution time are connected, but they are not always exactly the same in practice.
