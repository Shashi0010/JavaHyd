package com.zorin.day3;

public class ArrEmploy {

	public static void main(String[] args) {
		Employ employ1 = new Employ();
		
		employ1.empno=1;
		employ1.name="Praveen";
		employ1.basic=82833;
		
		Employ employ2 = new Employ();
		employ2.empno=3;
		employ2.name="Snehal";
		employ2.basic=88244;
		
		Employ employ3 = new Employ();
		employ3.empno=4;
		employ3.name="Srikanth";
		employ3.basic=88111;
		
		Employ[] employs = new Employ[] {
			employ1, employ2, employ3	
		};
		for (Employ employ : employs) {
			System.out.println("Employ No " +employ.empno);
			System.out.println("Employ Name  " +employ.name);
			System.out.println("Employ Salary  " +employ.basic);
			System.out.println("----------------------------------");
		}
		
	}
}
