package com.petrenko.ht6.icecream.creation;

import com.petrenko.ht6.icecream.type.Icecream;
import com.petrenko.ht6.kids.Kids;

public class Launcher {

	public static void main(String[] args) {
		
		Icecream icecream;
		Kids kid;
		
		IcecreamFactory icFactory = new IcecreamFactory();
		KidsFactory kFactory = new KidsFactory();

		IcecreamStore icStore = new IcecreamStore(icFactory);
		KidsStore kStore = new KidsStore(kFactory);
		
		icecream = icStore.orderIcecream("Chocolate ice cream on a stick");
		kid = kStore.createKid("Vanya");
		
		kid.eat(icecream);

		kStore.createKid("Masha").eat(icStore.orderIcecream("Chocolate ice cream on a stick"));
		kStore.createKid("Asya").eat(icStore.orderIcecream("Vanilla cone"));
		kStore.createKid("Petya").eat(icStore.orderIcecream("Chocolate ice cream on a stick"));
	}

}
