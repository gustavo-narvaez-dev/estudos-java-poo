package Encapsulation_Projetc;

public class Employee {

    private final String id;
    private final String name;
    private double baseSalary;

    public Employee(String id, String name, double baseSalary) {
        this.id = id;
        this.name = name;
        setBaseSalary(baseSalary);
    }

    public String getId() { return id; }

    public String getName() { return name; }

    public double getBaseSalary() { return baseSalary; }

    public void setBaseSalary(double baseSalary) {
        if (baseSalary < 1412) {
            this.baseSalary = 1412;
        } else {
            this.baseSalary = baseSalary;
        }
    }

    public void applyPerformanceBonus (double percentage) {
        if (percentage > 0) {
            this.baseSalary *= (1 + percentage / 100.0);
        }
    }

    public void displayInfos () {
        System.out.println("\n--- Employee Information ---");
        System.out.println("ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Base salary: " + getBaseSalary());
    }
}
