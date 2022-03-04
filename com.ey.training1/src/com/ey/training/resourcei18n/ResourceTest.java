package com.ey.training.resourcei18n;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceTest {

	public static void main(String[] args) {
		
		ResourceBundle bundle = ResourceBundle.getBundle("MyMessage", Locale.US);
		
		System.out.println("English US  = " +bundle.getString("message"));
		
		Locale.setDefault(new Locale("de", "DE"));
		
		bundle = ResourceBundle.getBundle("MyMessage");
		
		System.out.println("German DE   = " + bundle.getString("message"));
		
		

	}

}
