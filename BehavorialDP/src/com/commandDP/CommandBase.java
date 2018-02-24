package com.commandDP;

public abstract class CommandBase {
	
	public abstract DTO executeCommand(DTO dto);

	public DTO execute(DTO dto) {
		return executeCommand(dto);
	}
}
