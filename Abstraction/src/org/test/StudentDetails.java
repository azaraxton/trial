package org.test;

public class StudentDetails implements StudentInter{

	@Override
	public void studentName() {
		System.out.println("df");
	}

	@Override
	public void studentId() {
		System.out.println("ddf");
		}
	
	private void sudNo() {
		System.out.println("ddsf");

	}
	public static void main(String[] args) {
		StudentDetails d=new StudentDetails();
		d.studentId();
		d.studentName();
		d.sudNo();
	
	}

}
