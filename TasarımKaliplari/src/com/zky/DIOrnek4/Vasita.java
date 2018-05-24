package com.zky.DIOrnek4;

public class Vasita {
	
	 ITasit _tasit;
	    public Vasita(ITasit tasit)
	    {
	        _tasit = tasit;
	    }
	 
	    public void Kullan()
	    {
	        _tasit.GazVer();
	        _tasit.SagaSinyal();
	        _tasit.FrenYap();
	        _tasit.SolaSinyal();
	    }

}
