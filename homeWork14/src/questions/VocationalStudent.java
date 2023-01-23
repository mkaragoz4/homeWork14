package questions;

import java.util.Date;

public class VocationalStudent extends Student {

	public VocationalStudent(int no, String name, int year, Date dob, String major) {
		super(no, name, year, dob, major);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void register() {
		// TODO Auto-generated method stub
		
	}

	public void study() {
		
	}
	
	public String toString() {
		return "VocationalStudent [no=" + no + ", name=" + name + ", year=" + year + ", dob=" + dob 
				+ ", major=" + major + "]";
	}
	
	
}
