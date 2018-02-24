package com.commandDP;

public class DeleteCommand extends CommandBase{

	@Override
	public DTO executeCommand(DTO dto) {
		
		EmployeeDTO employeeDTO=(EmployeeDTO) dto;
		
		EmployeeEntity employeeEntity=new EmployeeEntity();
		employeeEntity.setEmployeeId(employeeDTO.getEmployeeId());
		
		Repository.removeEmployee(employeeEntity);
		
		return null;
	}
	
	

}
