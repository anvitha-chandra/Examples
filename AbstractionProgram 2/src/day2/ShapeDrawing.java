package day2;

import java.util.Scanner;

public class ShapeDrawing {
	 public static void main(String[] args) {
	     Scanner sc = new Scanner(System.in);
	     Shape[] shapes = new Shape[2];

	     for (int i = 0; i < 2; i++) {
	         System.out.print("Enter shape (circle/rectangle): ");
	         String type = sc.next().trim();

	         shapes[i] = (type.length() == 6 && type.charAt(0) == 'c') ? new Circle() : new Rectangle();
	     }
	     for (Shape s : shapes) s.draw();

	     sc.close();
	 }
	}
