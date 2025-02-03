package day2;

import java.util.Scanner;


abstract class PaymentMethod {
 double amount;

 public PaymentMethod(double amount) {
     this.amount = amount;
 }


 public abstract void processPayment();
}


class CreditCard extends PaymentMethod {
 public CreditCard(double amount) {
     super(amount);
 }

 public void processPayment() {
     System.out.println("Processing Credit Card Payment: Rs. " + (amount + amount * 0.02));
 }
}

class PayPal extends PaymentMethod {
 public PayPal(double amount) {
     super(amount);
 }

 public void processPayment() {
     System.out.println("Processing PayPal Payment: Rs. " + amount);
 }
}