package demo;

public class Quiz4 {
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
		case 4 : 
			System.out.println("Hi I am Karthik...");
		case 5 : 
			System.out.println("Hi I am Shashikanth...");
		default : 
			System.out.println("Invlid Choice...");
		}
	}
	public static void main(String[] args) {
		int choice=3;
		new Quiz4().show(choice);
	}
}
