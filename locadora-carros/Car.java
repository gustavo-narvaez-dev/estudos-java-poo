package OOP_02_BuyCars;

import java.util.Locale;

public class Car {

    private String name;
    private int year;
    private double price;

    public Car(String name, int year, double price) {
        this.name = name;
        setYear(year);
        setPrice(price);
    }

    public void setYear(int year) {
        if (year >= 1886) {
            this.year = year;
        } else {
            System.out.println("Error. The year must be >= 1886.");
        }
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Error. Price must be >= 0");
        }
    }

    private String getFormattedPrice() {
        return String.format(Locale.of("pt", "BR"), "R$ %.2f", this.price);
    }

    public void displaySpecs() {
        System.out.println("--- CAR SPECIFICATIONS ---");
        System.out.println("Name: " + name);
        System.out.println("Year: " + year);
        System.out.println("Price: " + getFormattedPrice() + "\n");
    }

    public void buyCar(double money) {
        if (money >= price) {
            System.out.println("Successful! You bought the car " + name);
        } else {
            System.out.println("Error. Your money is not sufficient. The car " + name + " costs " + getFormattedPrice());
        }
    }
}
