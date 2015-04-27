package com.petrenko.ht6.icecream.creation;

import com.petrenko.ht6.icecream.type.Icecream;

public class IcecreamStore {

	IcecreamFactory factory; // transfer a reference on factory

	public IcecreamStore(IcecreamFactory factory) {
		this.factory = factory;
	}

	public Icecream orderIcecream(String type) {
		Icecream icecream;
		icecream = factory.createIcecream(type);
		
		return icecream;

	}
	
	
}
