package com.zorin.day5;

public class EmployValidate {

	public StringBuilder validate(Employ employ) {
		boolean flag=true;
		StringBuilder sb=new StringBuilder();
		if(employ.empno < 0) {
			sb.append("Invalid Employ No \r\n");
			flag=false;
		}
		if(employ.name.length() > 12) {
			sb.append("Invalid Employ Name \r\n");
			flag=false;
		}
		if(employ.basic >= 50000) {
			sb.append("Invalid Salary \r\n");
			flag=false;
		}
		if (flag==true) {
			System.out.println(employ);
		}
		return sb;
	}
	public static void main(String[] args) {
		Employ employ = new Employ(1,"asdfkljasdfjklasdfkjajdf",44444);
		System.out.println(new EmployValidate().validate(employ));
	}
}
