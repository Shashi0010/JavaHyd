package com.hcl.project;

import java.util.List;

public class StudentBAL {

	static StringBuilder sb=new StringBuilder();
	
 	public boolean addStudentBal(Student objStudent) throws StudentException {
		boolean isAdded=true;
		
		if(objStudent.getSno() <= 0) {
			sb.append("StudentNo cannot be Negative or Zero \r\n" );
			isAdded=false;
		}
		
		if(objStudent.getName().length() <= 3) {
			sb.append("Name More than 3 characters \r\n");
			isAdded=false;
		}
		
		if(objStudent.getName().length() > 12) {
			sb.append("Name More than 12 characters \r\n");
			isAdded=false;
		}
		
		if(objStudent.getCity().length() <=3) {
			sb.append("City More than 3 characters \r\n");
			isAdded=false;
		}
		
		if(objStudent.getCity().length() > 12) {
			sb.append("City More than 12 characters \r\n");
			isAdded=false;
		}
		
		if(objStudent.getCgp() < 0) {
			sb.append("Cgp Non-Negative \r\n");
			isAdded=false;
		}
		if(isAdded==false) {
			throw new StudentException(sb.toString());
		} else {
			new StudentDAL().addStudentDao(objStudent);
		}
		return isAdded;
	}

	public Student searchStudentBal(int sno) {
		return new StudentDAL().searchStudentDao(sno);
	}
	
	public List<Student> showStudentBal() {
		return new StudentDAL().showStudentDao();
	}
	
	public String updateStudentBal(Student objStudent) {
		return new StudentDAL().updateStudentDao(objStudent);
	}
	
	public String deleteStudentBal(int sno) {
		return new StudentDAL().deleteStudentDao(sno);
	}
	
	public void writeStudentFileBal() {
		new StudentDAL().writeStudentFileDao();
	}
	
	public void readStudentFileBal() {
		new StudentDAL().readStudentFileDao();
	}


}
