package demo;

public class Exam {
	int x;
	public static void main(String[] args) {
		Exam obj1=new Exam();
		obj1.x=12;
		Exam obj2=obj1;
		obj2.x=13;
		System.out.println(obj1.x);
	}
}
