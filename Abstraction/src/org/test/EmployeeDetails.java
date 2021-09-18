package org.test;

public class EmployeeDetails extends AbstractTrail {

	@Override
	public void empName() {
		System.out.println("12312");
	}
	public static void main(String[] args) {
		EmployeeDetails e=new EmployeeDetails();
		e.empId();
		e.empName();
	}

}
