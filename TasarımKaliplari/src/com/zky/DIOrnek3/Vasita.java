package com.zky.DIOrnek3;

public class Vasita {
	//DependencyInjection bir nesne yaratma/atama metodolijisidir.Yani nesneye erisme tasarimidir.
	//Araba sinifinda yapilacak degisiklik dogrudan Vasita sinifini etkileyecektir.
	//Araba yerine Otobus kullanilmak istenirse Vasita sinifi yine etkilenecektir.
	//Amac: Araba sinifi istedigi kadar degissin ama Vasita sinifinin bundan haberi olmasin.DI
	 Araba araba;
	    public Vasita()
	    {
	        araba = new Araba();
	    }
	 
	    public void Kullan()
	    {
	        araba.GazVer();
	        araba.SagaSinyal();
	        araba.FrenYap();
	        araba.SolaSinyal();
	    }

}
