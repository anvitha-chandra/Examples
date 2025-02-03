package day2;

import java.util.Scanner;


abstract class Shape {
 public abstract void draw();
}


class Circle extends Shape {
 public void draw() { 
	 System.out.println("Drawing a Circle"); 
 }
}

class Rectangle extends Shape 
{
 public void draw() {
	 System.out.println("Drawing a Rectangle");
	 }
}



