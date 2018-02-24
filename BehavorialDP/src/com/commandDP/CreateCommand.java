package com.commandDP;

public class CreateCommand extends CommandBase{

	@Override
	public DTO executeCommand(DTO dto) {
		
		EmployeeDTO employeeDTO=(EmployeeDTO) dto;
		
		EmployeeEntity employeeEntity=new EmployeeEntity();
		employeeEntity.setEmployeeId(employeeDTO.getEmployeeId());
		
		Repository.addEmployee(employeeEntity);
		
		return null;
	}
	
	

}
