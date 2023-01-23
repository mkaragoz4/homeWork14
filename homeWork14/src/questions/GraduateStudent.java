package questions;

import java.util.Date;

public abstract class GraduateStudent extends Student{

	public GraduateStudent(int no, String name, int year, Date dob, String major) {
		super(no, name, year, dob, major);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void register() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void study() {
		// TODO Auto-generated method stub
		
	}

	public abstract void writeThesis();
	
	public abstract void meetWithAdvisor();
	
	
}
