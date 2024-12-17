package com.jtc;

import java.util.ArrayList;
import java.util.*;

public class generics {
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<String>();
        al.add("hello");
        al.add("hii");
        al.add("hnji");
        System.out.println(al);

        for(String s1:al){
            System.out.println(s1);
        }
        Iterator<String> itr=al.iterator();
        while (itr.hasNext()){
            String s2=itr.next();
            System.out.println(s2);
        }
    }
}
