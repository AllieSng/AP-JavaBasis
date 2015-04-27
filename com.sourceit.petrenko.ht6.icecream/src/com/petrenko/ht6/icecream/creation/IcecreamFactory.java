package com.petrenko.ht6.icecream.creation;

import com.petrenko.ht6.icecream.type.Chocolate;
import com.petrenko.ht6.icecream.type.Dairy;
import com.petrenko.ht6.icecream.type.Icecream;
import com.petrenko.ht6.icecream.type.Vanilla;

public class IcecreamFactory {
	
	public Icecream createIcecream(String type){
		
		Icecream icecream = null;
		
		if(type.equals("Chocolate ice cream on a stick")){
			icecream = new Chocolate();
		} else if (type.equals("Dairy ice cream")){
			icecream = new Dairy();
		} else if (type.equals("Vanilla cone")){
			icecream = new Vanilla();
		}
		return icecream;
	}

}
