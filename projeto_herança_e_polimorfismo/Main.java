package Heritage_Project;

public class Main {
    public static void main (String[] args) {

        PixTransaction pix = new PixTransaction("PIX-215", 150, "DCU#KD514S74");
        CreditCardTransaction credit = new CreditCardTransaction("CDT-1278", 1200, "****-4321", 10);

        pix.displaySummary();
        credit.displaySummary();
    }
} 
