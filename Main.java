public class Main {
    public static void main (String[] args) {

        Product keyboard = new Product();
        keyboard.name = "Samsung keyboard";
        keyboard.price = 199.99;
        keyboard.quantityInStock = 20;

        Product mouse = new Product();
        mouse.name = "Red Dragon mouse";
        mouse.price = 99.90;
        mouse.quantityInStock = 50;

        keyboard.displaySpecs();
        mouse.displaySpecs();

        keyboard.sellProduct(5);
        mouse.sellProduct(60);
    }
}
