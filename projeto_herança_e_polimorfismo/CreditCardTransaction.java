package Heritage_Project;

public class CreditCardTransaction extends Transaction {

    private final String cardNumber;
    private final int installments;

    public CreditCardTransaction (String id, double amount, String cardNumber, int installments) {
        super(id, amount);
        this.cardNumber = cardNumber;
        this.installments = installments;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public int getInstallments() {
        return installments;
    }

    @Override
    public void displaySummary () {
        System.out.println("- - - Credit Card Transaction Info - - -");
        super.displaySummary();
        System.out.println("Card Number: " + getCardNumber());
        System.out.println("Installments: " + getInstallments() + "x\n");
    }
}
