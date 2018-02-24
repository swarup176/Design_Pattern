package com.compositeDP;

import java.util.ArrayList;
import java.util.List;

interface component {
	 void showPrize();
	
}

class Leaf implements component {
	String name;
    int prize ; 
    
	public Leaf(String name, int prize) {
		super();
		this.name = name;
		this.prize = prize;
	}

	@Override
	public void showPrize() {
		System.out.println( name + " :" + prize );
	}

	
}

class Composite implements component {
	String name;
     List<component> comlist = new ArrayList<component>();
     
    public Composite addCompMem(component com){
    	 comlist.add(com) ;
    	 return this;
     } 
     
	public Composite(String name) {
		super();
		this.name = name;
	}

	@Override
	public void showPrize() {
		System.out.println( name  );
		for (component com:  comlist)
		com.showPrize();
	}
	 
	
}