package com.commandDP;

public enum Commands {

	CREATE("CREATE"),DELETE("DELETE"),VIEW("VIEW");
	
	private String name;
	private Commands(String name) {
		this.name=name;
	}
	
	public String toString() {
		return name;
	}
	
	
	public static Commands getEnumFromString(String command) {
		for(Commands commands: values()) {
			if(commands.toString().equalsIgnoreCase(command)) {
				return commands;
			}
		}
		return null;
	}
}
