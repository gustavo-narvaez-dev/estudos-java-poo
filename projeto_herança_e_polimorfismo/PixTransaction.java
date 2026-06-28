package Heritage_Project;

public class PixTransaction extends Transaction {

    private final String pixKey;

    public PixTransaction(String id, double amount, String pixKey) {
        super(id, amount);
        this.pixKey = pixKey;
    }

    public String getPixKey() {
        return pixKey;
    }

    @Override
    public void displaySummary() {
        System.out.println("- - - Pix Transaction Info - - -");
        super.displaySummary();
        System.out.println("Pix Key: " + getPixKey() + "\n");
    }
}
