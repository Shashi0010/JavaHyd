package demo;

public class CaseDemo {
	public void show(int choice) {
		switch(choice) {
		case 1 : 
			System.out.println("Hi I am Amit");
			break;
		case 2 : 
			System.out.println("Hi I am Prakash...");
			break;
		case 3 : 
			System.out.println("Hi I am Dinesh...");
			break;
		case 4 : 
			System.out.println("Hi I am Karthik...");
			break;
		case 5 : 
			System.out.println("Hi I am Shashikanth...");
			break;
		default : 
			System.out.println("Invlid Choice...");
		}
	}
	public static void main(String[] args) {
		int choice=45;
		new CaseDemo().show(choice);
	}
}
