package com.monocept.composite.pattern.test;

import com.monocept.composite.pattern.File;
import com.monocept.composite.pattern.Folder;

public class CompositeTest {
	public static void main(String[] args) {
		Folder root = new Folder("Movies");
		root.addChild(new File("abc.avi", 800, "video"));
		root.addChild(new File("pqr.avi", 803, "video"));

		Folder comedy = new Folder("comedy");
		comedy.addChild(new File("lmna.avi", 720, "video"));
		comedy.addChild(new File("alm.avi", 725, "video"));
		
		root.addChild(comedy);
		root.addChild(new File("az.mp4", 500, "video"));
			    
		System.out.println(root.displays(0));
	}

}
