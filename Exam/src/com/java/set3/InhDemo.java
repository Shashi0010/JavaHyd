package com.java.set3;

class Employ {
	int empno;
	String name;
	double basic;
	public Employ(int empno, String name, double basic) {
		super();
		this.empno = empno;
		this.name = name;
		this.basic = basic;
	}
	@Override
	public String toString() {
		return "Employ [empno=" + empno + ", name=" + name + ", basic=" + basic + "]";
	}
}

class Hr extends Employ {

	public Hr(int empno, String name, double basic) {
		super(empno, name, basic);
		// TODO Auto-generated constructor stub
	}
	
}

class Java extends Employ {
	public Java(int empno, String name, double basic) {
		super(empno, name, basic);
	}	
}
public class InhDemo {
	public static void main(String[] args) {
		Employ[] arr=new Employ[] {
				new Hr(1, "Niharika", 67774),
				new Java(3, "Dinesh", 55244),
				new Hr(4, "Lingaraj", 97774),
				new Java(5, "Prudhvi", 55244),
				new Hr(7, "Venky", 67884),
				new Java(10, "RamaKrishna", 55244),
				new Hr(15, "Krishna", 69774),
		};
		for(Employ e : arr) {
			if (e instanceof Java) {
				System.out.println(e);
			}
		}
	}
}
