package demo;
/**
 * Program for sum of 2 nos.
 * @author xyz
 *
 */

public class Calc {
  /**
   * Sum method for perfoming calculation.
   * @param a of integer type.
   * @param b of integer type.
   */
  public void sum(int a,int b) {
    int c = a + b; 
    System.out.println("Sum is  " + c);
  }
  /**
   * main method for calling business logic.
   * @param args as command line arguments.
   */
  
  public static void main(String[] args) {
    int a;
    int b;
    a = Integer.parseInt(args[0]);
    b = Integer.parseInt(args[1]);
    Calc obj = new Calc();
    obj.sum(a, b);
  }
}
