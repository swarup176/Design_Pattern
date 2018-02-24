package com.commandDP;

import java.util.EnumMap;
import java.util.ResourceBundle;

public class CommandRegistry {

	private static EnumMap<Commands, CommandBase> _registry = new EnumMap<Commands, CommandBase>(
			Commands.class);

	static {

		ResourceBundle bundle = ResourceBundle
				.getBundle("com.cts.dp.command.EmployeeCommand");

		for (String key : bundle.keySet()) {
			try {
				_registry
						.put(Commands.getEnumFromString(key),
								(CommandBase) Thread.currentThread()
										.getContextClassLoader()
										.loadClass(bundle.getString(key))
										.newInstance());
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
	
	public static CommandBase getCommand(Commands commands) {
		return _registry.get(commands);
	}

}
