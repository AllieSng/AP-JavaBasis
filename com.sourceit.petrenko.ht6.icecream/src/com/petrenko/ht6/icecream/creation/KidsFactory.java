package com.petrenko.ht6.icecream.creation;

import com.petrenko.ht6.kids.Asya;
import com.petrenko.ht6.kids.Kids;
import com.petrenko.ht6.kids.Masha;
import com.petrenko.ht6.kids.Petya;
import com.petrenko.ht6.kids.Vanya;

public class KidsFactory {
	
	public Kids bornKid(String name){
		Kids kid = null;
		
		if (name.equals("Vanya")){
			kid = new Vanya();
		} else if(name.equals("Masha")){
			kid = new Masha();
		} else if(name.equals("Asya")){
			kid = new Asya();
		} else if (name.equals("Petya")){
			kid = new Petya();
		}
		return kid;
	}
	

}
