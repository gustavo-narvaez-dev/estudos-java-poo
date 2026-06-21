public class Product {

    String name;
    double price;
    int quantityInStock;

    public void displaySpecs () {
        System.out.println("--- PRODUCT SPECIFICATIONS ---");
        System.out.println("Name: " + name);
        System.out.println("Price: R$ " + price);
        System.out.println("Quantity in stock: " + quantityInStock + " units\n");
    }

    public void sellProduct (int quantitySold) {
        if (quantityInStock >= quantitySold) {
            quantityInStock -= quantitySold;
            System.out.println("Successful sale! You buy " + quantitySold + " units of " + name);
        } else {
            System.out.println("Error. There are only " + quantityInStock + " units of " + name + " in stock");
        }
    }
}
