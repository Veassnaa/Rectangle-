import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       Rectangle rectangle = new Rectangle(3,7);
       System.out.println("Area "+rectangle.getArea());
       System.out.println("Perimeter "+rectangle.getPerimeter());
       Square square = new Square(5);
       System.out.println("Square Area = "+square.getArea());
    }
}