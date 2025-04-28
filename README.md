Assignment 3 - HashTable and Binary Search Tree (BST)
Project Description
This project involves the implementation of two essential data structures:

HashTable (MyHashTable): A hash table with separate chaining for collision resolution and a custom key class MyTestingClass.

Binary Search Tree (BST): A binary search tree that supports basic operations (put(), get(), delete()) and provides in-order traversal using an iterator.

Project Structure
MyTestingClass.java:

A custom class used as a key in the hash table.

Implements a custom hashCode() method combining the id and name fields.

MyHashTable.java:

A generic hash table implementation with separate chaining.

Includes methods like put(), get(), and printBucketSizes() to handle key-value pairs and print the distribution of elements across the hash table.

HashTableTest.java:

A test class that inserts 10,000 random elements into the hash table.

Prints the number of elements in each bucket to verify the uniform distribution of keys.

BST.java:

A generic binary search tree (BST) with key-value pairs.

Implements put(), get(), delete(), and size() methods.

Provides an in-order traversal iterator to access elements in sorted order.

BSTTest.java:

A test class that verifies the in-order traversal of the BST and checks that both key and value can be accessed during iteration.

How to Run
1. Compile the Java Files
To compile all the Java files, run:

bash
Копировать
javac *.java
2. Run the Tests
To test the HashTable:

bash
Копировать
java HashTableTest
To test the Binary Search Tree (BST):

bash
Копировать
java BSTTest
Implementation Overview
HashTable (MyHashTable)
Uses an array of linked lists for collision resolution (separate chaining).

put() inserts key-value pairs, and get() retrieves values based on keys.

The hashCode() method in MyTestingClass ensures keys are distributed evenly across the hash table buckets.

Random data is inserted into the table, and the number of elements in each bucket is printed to verify uniform distribution.

Binary Search Tree (BST)
Implements a basic binary search tree with key-value pairs.

Supports in-order traversal through an iterator (non-recursive).

The size() method calculates the total number of nodes in the tree.

The put(), get(), and delete() methods allow for efficient insertions, lookups, and removals of nodes in the tree.

Conclusion
This project demonstrates the implementation and testing of both a HashTable with custom key handling and a Binary Search Tree with in-order traversal 
and basic operations. The solutions implement key principles of data structure design, ensuring efficient and well-tested operations.

