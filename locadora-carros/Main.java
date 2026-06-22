package OOP_02_BuyCars;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {

        Car byd = new Car("BYD Dolphin Mini", 2024, 109000);
        Car corolla = new Car("Corolla Cross", 2020, 162000);
        Car uno = new Car("Fiat Uno", 2010, 15000);

        byd.displaySpecs();
        corolla.displaySpecs();
        uno.displaySpecs();

        System.out.println("Select the car for buy:\n(1 - BYD Dolphin Mini)\n(2 - Corolla Cross)\n(3 - Fiat Uno)");
        Scanner scanner = new Scanner(System.in);
        int choose = Integer.parseInt(scanner.nextLine());

        System.out.println("\nEnter your money for buy the car: ");
        double money = Double.parseDouble(scanner.nextLine());

        if (choose == 1) {
            byd.buyCar(money);
        } else if (choose == 2) {
            corolla.buyCar(money);
        } else if (choose == 3) {
            uno.buyCar(money);
        } else {
            System.out.println("Error. Your choose must be 1, 2 or 3.");
        }
        scanner.close();
    }
}
