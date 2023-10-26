package Main_Package;

import binarysearchtree.BinarySearchTree;
import graph.Graph;
import hashtable.HashTable;
import linkedlist.DoublyLinkedList;
import linkedlist.LinkedList;
import stack.Stack;

import java.util.Arrays;
import java.util.HashMap;


public class Main {

    public static void main(String[] args) {

//        HashTable myHashTable = new HashTable();
//
//        myHashTable.set("nails", 100);
//        myHashTable.set("tile", 50);
//        myHashTable.set("lumber", 80);
//
//        System.out.println("Lumber:");
//        System.out.println(myHashTable.get("lumber"));
//
//        System.out.println("\nBolts:");
//        System.out.println(myHashTable.get("bolts"));

//        myHashTable.set("paint", 20);
//        myHashTable.set("bolts", 40);
//        myHashTable.set("nails", 100);
//        myHashTable.set("tile", 50);
//        myHashTable.set("lumber", 80);
//
//        System.out.println(myHashTable.keys());

        Graph myGraph = new Graph();
        myGraph.addVertex("A");
        myGraph.addVertex("B");
        myGraph.addEdge("A", "B");
        myGraph.printGraph();
    }

    public int removeDuplicates(int[] nums) {
        int length = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[i + 1]) {
                nums[length] = nums[i];
                length++;
            }
        }
        return length;
    }
}
