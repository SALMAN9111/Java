package com.monocept.proxy.pattern.test;

import com.monocept.proxy.pattern.Image;
import com.monocept.proxy.pattern.ProxyImage;
import com.monocept.proxy.pattern.RealImage;

public class ProxyTest {
	public static void main(String[] args) {
		/*Image img1 = new RealImage("one.jpg");
		Image img2 = new RealImage("two.jpg");
		Image img3 = new RealImage("three.jpg");
		
		img3.display();*/
		
		Image img4 = new ProxyImage("four.jpg");
		Image img5 = new ProxyImage("five.jpg");
		Image img6 = new ProxyImage("six.jpg");
		
		img6.display();
		
	}

}
