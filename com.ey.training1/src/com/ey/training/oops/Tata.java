package com.ey.training.oops;

public class Tata implements Car{

	@Override
	public void getEngineDetails() {
		System.out.println("2000 cc engine");
		
	}

	@Override
	public void getModel() {
		System.out.println("Tiago NCR");
		
	}

	@Override
	public void getVersion() {
		System.out.println("Petrol");
		
	}

}
