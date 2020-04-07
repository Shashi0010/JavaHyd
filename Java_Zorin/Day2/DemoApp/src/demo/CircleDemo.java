package demo;
/**
 * Program to calculate area and circumference.
 * @author xyz.
 *
 */

public class CircleDemo {
  /**
   * Method calc for perfoming business logic.
   * @param radius for accepting radius value.
   */
  public void calc(double radius) {
    double area;
    double circ;
    area = Math.PI * Math.pow(radius, 2);
    circ = 2 * Math.PI * radius;
    System.out.println("Area of Circle  " + area);
    System.out.println("Circumference   " + circ);
  }
  
  /**
   * Main method for calling business logic.
   * @param args for command line arguments.
   */
  public static void main(String[] args) {
    double radius = 8.7;
    CircleDemo obj = new CircleDemo();
    obj.calc(radius);
  }
}
