package com.commandDP;

import java.util.ArrayList;
import java.util.List;

public class Repository {
	
	private static List<EmployeeEntity> employeeEntities=new ArrayList<EmployeeEntity>();

	public static void addEmployee(EmployeeEntity employeeEntity) {
		employeeEntities.add(employeeEntity);
	}
	
	public static void removeEmployee(EmployeeEntity employeeEntity) {
		
		for(EmployeeEntity employeeEntity2 :employeeEntities) {
			
			if(employeeEntity2.getEmployeeId()==employeeEntity.getEmployeeId()) {
				employeeEntities.remove(employeeEntity2);
				break;
			}
		}
		
	}
	
	public static List<EmployeeEntity> viewEmployee() {
		return employeeEntities;
	}
}
