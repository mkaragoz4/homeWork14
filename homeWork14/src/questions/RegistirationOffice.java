package questions;

import java.util.Date;

public class RegistirationOffice extends Student {
	
	public RegistirationOffice(int no, String name, int year, Date dob, String major) {
		super(no, name, year, dob, major);
		// TODO Auto-generated constructor stub
	}

	Student newStudent;

	
	
	public Student getAStudent() {
		
		return getAStudent();
		
	}
	public void registerStudent(Student student) {
		newStudent = student;
		System.out.println(newStudent);
	
	}

	@Override
	public void study() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void register() {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
