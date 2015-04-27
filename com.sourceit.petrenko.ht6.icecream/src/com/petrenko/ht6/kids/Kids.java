package com.petrenko.ht6.kids;

import com.petrenko.ht6.icecream.type.Icecream;

public abstract class Kids implements Eatable{
	
	String name;
	String action;
	
	@Override
	public void eat(Icecream icecream) {
		System.out.print(name + " " + action +  " ");
		icecream.printTaste();
		
	}
}
