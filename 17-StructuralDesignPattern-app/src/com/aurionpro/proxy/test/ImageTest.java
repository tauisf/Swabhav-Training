package com.aurionpro.proxy.test;

import com.aurionpro.proxy.model.IImage;
import com.aurionpro.proxy.model.ProxyImage;
// caching example
public class ImageTest {
	 public static void main(String[] args) {
	        IImage image = new ProxyImage("Photos");

	        // loading image 
	        image.display();

	       // if already load will not be loaded again
	        image.display();
	    }
}
