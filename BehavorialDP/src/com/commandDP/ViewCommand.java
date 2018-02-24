package com.commandDP;

import java.util.List;

public class ViewCommand extends CommandBase {

	@Override
	public DTO executeCommand(DTO dto) {
		
		List<EmployeeEntity> employeeEntities=Repository.viewEmployee();
		EmployeeDTO employeeDTO=null;
		EmployeeListDTO employeeListDTO=new EmployeeListDTO();
		for(EmployeeEntity employeeEntity:employeeEntities) {
			employeeDTO=new EmployeeDTO();
			employeeDTO.setEmployeeId(employeeEntity.getEmployeeId());
			employeeListDTO.getEmployeeDTOs().add(employeeDTO);
		}
		
		
		return employeeListDTO;
	}

}
