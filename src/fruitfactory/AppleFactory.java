package fruitfactory;

import java.util.Objects;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class AppleFactory implements GroceryProductFactory {
    String productName = "Apple";
    String price = "0";
    public AppleFactory() {
        try {
            File file = new File("src/database.txt");
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] split = line.split(" ");
                String product = split[0];
                if (product == productName)
                    price = split[1];
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            e.printStackTrace();
        }
    }

    @Override
    public GroceryProduct makeProduct() {
        GroceryProduct product = new Apples();
        product.setPrice(Float.parseFloat(price));
        System.out.println("A new " + productName + " has been created.");
        return product;
    }

}
