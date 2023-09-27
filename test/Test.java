package test;

import fruitfactory.GroceryProductFactory;
import fruitfactory.GroceryProduct;
import fruitfactory.AppleFactory;
import fruitfactory.BananaFactory;

public class Test {
    public static void main(String[] args) {
        GroceryProductFactory Applefactory = new AppleFactory();
        GroceryProductFactory Bananafactory = new BananaFactory();

        GroceryProduct appleproduct = Applefactory.makeProduct();
        GroceryProduct bananaproduct = Bananafactory.makeProduct();

        System.out.println("The price of the apple is " + appleproduct.getPrice());
        System.out.println("The price of the banana is " + bananaproduct.getPrice());
    }
}