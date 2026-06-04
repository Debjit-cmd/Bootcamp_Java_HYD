package BankAccount;

import java.util.Scanner;

class EmployeeSystem {
    String name;
    int salary;
    int id;

    void display() {
        System.out.println("Name = " + name + " id = " + id + " Salary = " + salary);
    }
}

class Mobile {
    String phoneNumber;
    String countryCode;

    void videoCalling() {
        System.out.println("Person is video calling");
    }

    void normalCalling() {
        System.out.println("Person is normal calling");
    }

    void display() {
        System.out.println("Phone number with country code = " + countryCode + phoneNumber);
    }
}

class OnlineDelivery {
    int quantity;

    void orderFood() {
        System.out.println(quantity + " " + "Food has been ordered");
    }

    void trackOrder() {
        System.out.println("Food is being tracked");
    }
}

class TravellingRapido {
    String from, to;

    void trackRide(String from, String to) {
        this.from = from;
        this.to = to;
        System.out.println("Tracking ride from " + from + " to " + to);
    }

    void cancelRide() {
        System.out.println("Ride has been cancelled");
    }
}

public class EmployeeManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        EmployeeSystem e = new EmployeeSystem();
        System.out.println("Enter name, salary and id:");
        e.name = sc.nextLine();
        e.salary = sc.nextInt();
        e.id = sc.nextInt();
        sc.nextLine();
        e.display();

        System.out.println("Enter mobile number and country code:");
        Mobile m = new Mobile();
        m.phoneNumber = sc.nextLine();
        m.countryCode = sc.nextLine();
        m.videoCalling();
        m.normalCalling();
        m.display();

        System.out.println("Enter number of items needed:");
        OnlineDelivery o = new OnlineDelivery();
        o.quantity = sc.nextInt();
        sc.nextLine();
        o.orderFood();
        o.trackOrder();

        System.out.println("Enter From & To Location:");
        TravellingRapido rap = new TravellingRapido();
        String from = sc.nextLine();
        String to = sc.nextLine();
        rap.trackRide(from, to);
        rap.cancelRide();

        sc.close();
    }
}