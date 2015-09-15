package com.haihu.javaCore.collection;

import java.util.AbstractCollection;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class SetDemo {
	public static void main(String[] args) {
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		lhs.add("123");
		lhs.add("789");
		lhs.add("456");

		
		Long timeStart = System.currentTimeMillis();
		Iterator<String> it = lhs.iterator();
        while (it.hasNext())  
        {  
                System.out.println(it.next());  
        }  
        Long timeStop = System.currentTimeMillis();  
        System.out.println( timeStop -timeStart );  
        java.lang.Runtime.getRuntime();
        
        java.lang.Math.random();
	}
}
