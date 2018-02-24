package com.commandDP;

public class ApplicationController {

	private static ApplicationController applicationController=new ApplicationController();
	
	private ApplicationController() {
		
	}
	
	public static ApplicationController getInstance() {
		return applicationController;
	}
	
	public static DTO execute(Commands commands,DTO dto) {
		CommandBase commandBase= CommandRegistry.getCommand(commands);
		return commandBase.execute(dto);
		
	}
}
