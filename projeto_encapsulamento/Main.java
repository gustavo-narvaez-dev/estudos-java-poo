package Encapsulation_Projetc;

public class Main {
    public static void main (String[] args) {
        Employee e1 = new Employee("DEV-19", "Arthur Gustavo", 3000);
        Employee e2 = new Employee("EST-01", "Pedro", 500);

        e1.displayInfos();
        e1.applyPerformanceBonus(10);
        System.out.printf("With 10 percent bonus: %.2f\n", e1.getBaseSalary());

        e2.displayInfos();
        e2.applyPerformanceBonus(50);
        System.out.printf("With 50 percent bonus: %.2f\n", e2.getBaseSalary());
    }
}
