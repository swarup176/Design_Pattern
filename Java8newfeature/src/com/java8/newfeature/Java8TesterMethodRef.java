package com.java8.newfeature;

import java.util.List;
import java.util.ArrayList;

public class Java8TesterMethodRef {
   public static void main(String args[]){
      List<String> names = new ArrayList<String>();
		
      names.add("Mahesh");
      names.add("Suresh");
      names.add("Ramesh");
      names.add("Naresh");
      names.add("Kalpesh");
      
      names.forEach(System.out::println);
   }
}