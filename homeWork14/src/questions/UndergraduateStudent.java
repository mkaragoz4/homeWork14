package questions;

import java.util.Date;

public class UndergraduateStudent extends Student {

	public UndergraduateStudent(int no, String name, int year, Date dob, String major) {
		super(no, name, year, dob, major);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void study() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void register() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return "UndergraduateStudent [no=" + no + ", name=" + name + ", year=" + year + ", dob=" + dob + ", major="
				+ major + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}

	
	
	
	
	
}
