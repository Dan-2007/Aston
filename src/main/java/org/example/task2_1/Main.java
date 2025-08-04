package org.example.task2_1;

import org.example.task2_1.arrayList.MyArrayList;
import org.example.task2_1.hashSet.MyHashSet;

import java.util.*;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
 /*       MyArrayList myArrayList = new MyArrayList();
        List<String> list = new ArrayList<>(Arrays.asList("John", "Sarah", "T-100", "T-1000", "Kyle's corpse", "James' cam", "Liquid metal", "Iron skeleton", "Myles' hand", "Dead parent", "Clothes", "Biker's nose"));
        myArrayList.addAll(list);
        System.out.println(myArrayList.get(1));
        System.out.println(myArrayList.get(0));

        myArrayList.add("Motorcycle");
        myArrayList.add("Nitrogen truck");
        myArrayList.add("Cyborg");
        System.out.println(myArrayList.getSize());
        myArrayList.remove(3);
        myArrayList.remove(5);
        for (int i = 0; i < myArrayList.getSize(); i++)
            System.out.println(myArrayList.get(i));
        System.out.println(myArrayList.getSize());*/

        MyHashSet<String> myHashSet = new MyHashSet<>();
        List<String> myList = new ArrayList<>(Arrays.asList("Love", "Hate", "Sex", "Pain", "Love"));
        for (String s : myList)
            myHashSet.add(s);
        for (Object e : myHashSet)
            System.out.println(e.toString());
        }
}
