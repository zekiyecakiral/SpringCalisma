package com.zky;

public class Araba {
	
	private Yakit yakit;
	
	public Araba() {
		
		this.yakit = new Yakit();
		
	}
	public void hareketeGec() {
		yakit.depo();
		System.out.println("Araba harekete ge�ti.");
		
		
	}

}
