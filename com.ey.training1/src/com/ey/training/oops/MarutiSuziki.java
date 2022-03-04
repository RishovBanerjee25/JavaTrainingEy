package com.ey.training.oops;

import java.io.Serializable;

public class MarutiSuziki implements Car{

	@Override
	public void getEngineDetails() {
		System.out.println("1800 cc engine");
	}

	@Override
	public void getModel() {
		System.out.println("Swift dzire");
	}

	@Override
	public void getVersion() {
		System.out.println("Diesel version");
	}



}
