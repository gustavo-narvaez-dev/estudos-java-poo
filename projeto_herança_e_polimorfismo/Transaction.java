package Heritage_Project;

public abstract class Transaction {

    private final String id;
    private final double amount;

    public Transaction(String id, double amount) {
        this.id = id;
        this.amount = amount;
    }

    public String getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }

    public void displaySummary() {
        System.out.println("ID: " + getId());
        System.out.printf("Amount: R$ %.2f\n", getAmount());
    }
}
