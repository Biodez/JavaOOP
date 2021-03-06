package Dealership;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        Car[] cars = new Car[] {
            new Car("Nissan", 5000, 2020, "red", new String[] {"tires", "keys"}),
            new Car("Dodge", 8500, 2019, "blue", new String[] {"tires", "keys"}),
            new Car("Nissan", 5000, 2017, "yellow", new String[] {"tires", "filter"}),
            new Car("Honda", 7000, 2019, "orange", new String[] {"tires", "filter"}),
            new Car("Mercedes", 12000, 2015, "jet black", new String[] {"tires", "filter", "transmission"})
        };
        
        Dealership dealership = new Dealership(cars);
        System.out.println("\n ****** JAVA DEALERSHIP! ****** \n");
        while (true) {
            System.out.print("Welcome! Enter the type of car you're looking for: ");
            if (scan.hasNextInt()) {
                scan.nextLine();
                System.out.println("INVALID INPUT");
                continue;
            }
            String carModel = scan.nextLine();
            System.out.print("Enter your budget: ");
            if (!scan.hasNextInt()) {
                scan.nextLine();
                System.out.println("INVALID INPUT");
                continue;
            }
            int carBudget = scan.nextInt();
            if (dealership.search(carModel, carBudget) == 404) {
                System.out.println("Feel free to browse through our collection of cars.\n");
                System.out.println(dealership);
            }
            scan.nextLine();
            String decison = scan.nextLine();
            if (decison.equalsIgnoreCase("yes")) {
                dealership.sell(dealership.search(carModel, carBudget));
                break;
            }

        }
        
        

        scan.close();

    }
}


