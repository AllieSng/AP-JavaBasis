package com.petrenko.ht6.icecream.creation;

import com.petrenko.ht6.kids.Kids;

public class KidsStore {

	KidsFactory factory;

	public KidsStore(KidsFactory factory) {
		this.factory = factory;
	}

	public Kids createKid(String name) {
		Kids kid;
		kid = factory.bornKid(name);
		return kid;
	}

}
