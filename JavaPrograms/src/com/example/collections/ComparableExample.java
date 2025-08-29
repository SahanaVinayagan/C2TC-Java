package com.example.collections;
import java.util.*;

public class ComparableExample {

    public static void main(String[] args) {
        ArrayList<Students> al = new ArrayList<>();
        al.add(new Students(1, "Arjun", 66.47f));
        al.add(new Students(2, "Anu", 66.45f));
        al.add(new Students(3, "Ayush", 89.79f));
        al.add(new Students(4, "John", 87.45f));

        System.out.println("Before sorting:");
        System.out.println(al);

        Comparator<Students> comp = (s1, s2) -> Float.compare(s1.getPer(), s2.getPer());
        al.sort(comp);

        Iterator i=al.iterator();
        while(i.hasNext()) {
        	Object obj=i.next();
        	System.out.println(obj);
        }
    }
}




