package fruitfactory;

public class AppleFactory implements GroceryProductFactory {
    String productName = "Apple";

    @Override
    public GroceryProduct makeProduct() {
        GroceryProduct product = new Apples();
        product.setPrice(0);
        System.out.println("A new " + productName + " has been created.");
        return product;
    }
}
