package com.zky.DIOrnek4;

public class Vasita2 {
	 public ITasit _tasit;
	 
	    public void Kullan()
	    {    
	        _tasit.GazVer();
	        _tasit.SagaSinyal();
	        _tasit.FrenYap();
	        _tasit.SolaSinyal();
	    }

		public ITasit get_tasit() {
			return _tasit;
		}


		public void set_tasit(ITasit _tasit) {
			this._tasit = _tasit;
		}
	    

}
