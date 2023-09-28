package fruitfactory;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Objects;
import java.util.Scanner;

public class BananaFactory implements GroceryProductFactory {
    String productName = "Banana";
    String price = "0";

    public BananaFactory() {
        try {
            File file = new File("src/database.txt");
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] split = line.split(" ");
                String product = split[0];
                if (Objects.equals(product, productName))
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
        GroceryProduct product = new Bananas();
        product.setPrice(Float.parseFloat(price));
        System.out.println("A new " + productName + " has been created.");
        return product;
    }
}
