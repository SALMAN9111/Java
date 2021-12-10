package com.monocept.iterator.design.test;

import com.monocept.iterator.design.Iterator;
import com.monocept.iterator.design.NameRepository;

public class IteratorTest {
	
	   public static void main(String[] args) {
	      NameRepository namesRepository = new NameRepository();

	      for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
	         String name = (String)iter.next();
	         System.out.println("Name : " + name);
	      } 	
	   }
	}