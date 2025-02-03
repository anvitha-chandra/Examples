package day2;

import java.util.Scanner;

public class Vehicle {
	void startEngine() {
		 System.out.println("Starting the vehicle engine...");
	}
}
class Car extends Vehicle{
	public void startEngine() { 
		System.out.println("Car engine started"); 
		}
	}

class Motorcycle extends Vehicle{
	public void startEngine() {
		System.out.println("Motorcycle engine starts");
	}
}	
	
