package fruitfactory;

public class BananaFactory implements GroceryProductFactory {
    String productName = "Banana";

    @Override
    public GroceryProduct makeProduct() {
        GroceryProduct product = new Bananas();
        product.setPrice(0);
        System.out.println("A new " + productName + " has been created.");
        return product;
    }
}
