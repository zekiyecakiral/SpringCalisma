package com.zky.DIOrnek4;

public class Program {

	 public static void main(String[] args)
	    {
	        Vasita vasitaAraba = new Vasita(new Araba());
	        vasitaAraba.Kullan();
	        //veya
	        Vasita vasitaOtobus = new Vasita(new Otobus());
	        vasitaOtobus.Kullan();
	        //veya
	        Vasita vasitaMotor = new Vasita(new Motor());
	        vasitaMotor.Kullan();
	    }
}
