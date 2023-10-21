package Main_Package;

import binarysearchtree.BinarySearchTree;
import hashtable.HashTable;
import linkedlist.DoublyLinkedList;
import linkedlist.LinkedList;
import stack.Stack;

import java.util.HashMap;


public class Main {

    public static void main(String[] args) {
        HashTable myHashTable = new HashTable();
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

        myHashTable.set("paint", 20);
        myHashTable.set("bolts", 40);
        myHashTable.set("nails", 100);
        myHashTable.set("tile", 50);
        myHashTable.set("lumber", 80);

        System.out.println(myHashTable.keys());
    }
}
