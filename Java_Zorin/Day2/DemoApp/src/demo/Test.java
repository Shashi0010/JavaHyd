package demo;

public class Test {

	public void check(int x) {
		if (x=2) {
		 System.out.println("Hi " +x);
		} else {
	         System.out.println("Bye " +x);
		}
	    }	
	    public static void main(String[] args) {
		new Test().check(2);
	    }
}
