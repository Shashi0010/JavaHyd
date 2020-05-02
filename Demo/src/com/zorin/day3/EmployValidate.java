package com.zorin.day3;

public class EmployValidate {

	public StringBuilder validateEmploy(Employ employ) {
		StringBuilder sb = new StringBuilder();
		if (employ.empno <= 0) {
			sb.append("\r\n Invalid Employ Number...");
		} else if (employ.name.length() > 12) {
			sb.append("\r\n Invalid Employ Name...");
		} else if (employ.basic >= 50000) {
			sb.append("\r\n Invalid Employ Salary...");
		} else {
			sb.append("Employ No  " +employ.empno + "\r\n Employ Name " +employ.name
					+ " Employ Salary " +employ.basic);
		}
		return sb;
	}
	public static void main(String[] args) {
		Employ employ = new Employ();
		employ.empno=1;
		employ.name="Ramakrishna Devaki raj";
		employ.basic=88333;
		EmployValidate obj = new EmployValidate();
		StringBuilder sb = obj.validateEmploy(employ);
		System.out.println(sb);
	}
}
