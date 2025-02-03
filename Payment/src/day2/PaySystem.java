package day2;

import java.util.Scanner;

public class PaySystem {
    
    public static void processTransaction(PaymentMethod paymentMethod) {
        paymentMethod.processPayment();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter payment method (credit/paypal): ");
        String method = s.next();
        
        System.out.print("Enter the amount: ");
        double amount = s.nextDouble();

      
        PaymentMethod payment = null;
        if (method.equalsIgnoreCase("credit")) {
            payment = new CreditCard(amount);
        } else if (method.equalsIgnoreCase("paypal")) {
            payment = new PayPal(amount);
        }

       
        if (payment != null) {
            processTransaction(payment);  
        } else {
            System.out.println("Invalid payment method.");
        }

      
    }
}
