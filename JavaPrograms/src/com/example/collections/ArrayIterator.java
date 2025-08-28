package com.example.collections;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import com.example.arrays.Students;

public class ArrayIterator {
    public static void main(String[] args) {
        List<Object> al = new ArrayList<>();
        al.add(10);
        al.add("Alice");
        al.add(30);
        Students s1 = new Students(1, "Bob");
        al.add(s1);
        System.out.println("Full List: " + al);
        System.out.println("Size: " + al.size());
        Iterator i = al.iterator();
        while (i.hasNext()) {
            Object obj = i.next();
            System.out.println(obj);
        }
    }
}
