package com.compositeDP;

public class ComputerDDPTest {
	public static void main(String[] args) {
		component mouse= new Leaf("mouse",400 );
		component keyBoard= new Leaf("keyBoard",1500 );
		component ram= new Leaf("Ranm",2000 );
		component cpu= new Leaf("cpu",9000 );
		component monitor= new Leaf("monitor",6000 );
		
		Composite mb = new Composite("mother board").addCompMem(ram);
		
		Composite peri = new Composite("periferal").addCompMem(mouse).addCompMem(keyBoard);
		
		Composite comp = new Composite("computer ").addCompMem(monitor).addCompMem(peri).addCompMem(cpu);
		
		comp.showPrize();
		
	}
	
	
}
