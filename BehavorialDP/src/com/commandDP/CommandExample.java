package com.commandDP;

public class CommandExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		EmployeeDTO employeeDTO = new EmployeeDTO();
		employeeDTO.setEmployeeId(168036);

		ApplicationController.execute(Commands.CREATE, employeeDTO);

		EmployeeDTO employeeDTO2 = new EmployeeDTO();
		employeeDTO2.setEmployeeId(123456);

		ApplicationController.execute(Commands.CREATE, employeeDTO2);

		EmployeeDTO employeeDTO3 = new EmployeeDTO();
		employeeDTO3.setEmployeeId(168036);

		ApplicationController.execute(Commands.DELETE, employeeDTO3);

		EmployeeListDTO employeeListDTO = (EmployeeListDTO) ApplicationController
				.execute(Commands.VIEW, null);
		
		for(EmployeeDTO employeeDTO4:employeeListDTO.getEmployeeDTOs()) {
			System.out.println(employeeDTO4.getEmployeeId());
		}
 
	}

}
