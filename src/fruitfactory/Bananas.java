package fruitfactory;

public class Bananas implements GroceryProduct {
    private float price;

    @Override
    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public float getPrice() {
        return this.price;
    }
}
