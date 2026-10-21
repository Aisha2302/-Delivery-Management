//public class Main {
//    public static void main(String[] args) {
//        // create objects
//        Student student1 = new Student();
//        Student student2 = new Student("Hawa Mohamed", "C11213", "+278687", 3.8, true);
//        Student student3 = new Student();
//
//        // print using toString
//        System.out.println(student1.toString());
//        System.out.println(student2.toString());
//        System.out.println(student3.toString());
//
//        // or use display()
//        student1.display();
//        student2.display();
//    }
//}

//public class Main {
//
//    static void main(String[] args) {
//        //create an object
//        Student student1 = new Student();
//        Student student2 = new Student("Hawa mohamed",
//                "C11213", "+278687", 3.8, true);
//
//        student1 = student2;
//
//        System.out.println(student1.toString());
////        System.out.println(student2);


//        //TV class object creation
//        TV hiSense = new TV();
//
//        hiSense.turnOn();
//        hiSense.setChannel(30);
//        hiSense.volumeUp();
//        hiSense.volumeUp();
//        hiSense.volumeUp();
//        hiSense.turnOff();
//        hiSense.turnOn();
//
//        System.out.println(hiSense.toString());
//
//
//
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//
//        BankAccount account = new BankAccount("Aisha", 1000);
//
//        account.deposit(500);
//        account.withdraw(200);
//
//        account.displayAccountInfo();
//
//        BankAccount.displayBankInfo();
//    }
//}





// ASSIGMENT DELIVEY

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Delivery> deliveries = new ArrayList<>();

        System.out.print("How many deliveries? ");
        int number = input.nextInt();

        for (int i = 1; i <= number; i++) {

            System.out.print("Delivery " + i + " - type (R/E): ");
            String type = input.next();

            System.out.print("Delivery " + i + " - distance (km): ");
            int distance = input.nextInt();

            System.out.print("Delivery " + i + " - weight (kg): ");
            int weight = input.nextInt();

            if (type.equalsIgnoreCase("R")) {
                deliveries.add(new RegularDelivery(distance, weight));
            } else if (type.equalsIgnoreCase("E")) {
                deliveries.add(new ExpressDelivery(distance, weight));
            }
        }

        long total = 0;

        System.out.println("\n--- DELIVERY FEE SUMMARY ---");

        for (int i = 0; i < deliveries.size(); i++) {
            long fee = deliveries.get(i).calculateFee();

            System.out.println("Delivery " + (i + 1) + ": "
                    + fee + " units");

            total += fee;
        }

        System.out.println("Total delivery fees: "
                + total + " units");

        input.close();
    }
}