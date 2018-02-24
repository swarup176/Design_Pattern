package com.commandDP;

import java.util.ArrayList;
import java.util.List;

public class EmployeeListDTO implements DTO {

	private List<EmployeeDTO> employeeDTOs=new ArrayList<EmployeeDTO>();

	public List<EmployeeDTO> getEmployeeDTOs() {
		return employeeDTOs;
	}

	public void setEmployeeDTOs(List<EmployeeDTO> employeeDTOs) {
		this.employeeDTOs = employeeDTOs;
	}
	
	
	
}
