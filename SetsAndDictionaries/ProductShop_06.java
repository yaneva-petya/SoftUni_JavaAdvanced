package Lectures.SetsAndDictionaries.Problems;
import java.util.*;

public class ProductShop_06 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Map<String, List<String>> shops = new TreeMap<>();

        Map<String, Double> priceProducts = new LinkedHashMap<>();

        String input = s.nextLine();

        while (!"Revision".equals(input)) {
            String[] data = input.split(", ");
            String shopName = data[0];
            String product = data[1];
            double price = Double.parseDouble(data[2]);

            shops.putIfAbsent(shopName, new ArrayList<>());

            shops.get(shopName).add(product);

            priceProducts.put(product, price);

            input = s.nextLine();
        }

        shops.forEach((shopName, products) -> {
            System.out.println(shopName + "->");
            products.forEach(product -> {
                System.out.printf("Product: %s, Price: %.1f\n", product, priceProducts.get(product));
            });
        });
    }
}
