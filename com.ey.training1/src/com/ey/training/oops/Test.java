package com.ey.training.oops;

public class Test {

	public static void main(String[] args) {
		Car mrt = new MarutiSuziki();
		Car tata = new Tata();
		
		mrt.getEngineDetails();
		
		mrt.getModel();
		
		mrt.getVersion();
		
		tata.getEngineDetails();
		tata.getModel();
		tata.getVersion();
	}

}
