package com.Builder_pattern;

public class PCBuilder {

	  private String ram;
	    private String hdd;
	    private String cpu;
		public void setRam(String ram) {
			this.ram = ram;
		}
		public void setHdd(String hdd) {
			this.hdd = hdd;
		}
		public void setCpu(String cpu) {
			this.cpu = cpu;
		}
	     
	 public  PC buildPC(){
		   return new PC(ram, hdd, cpu);
	   }
}
