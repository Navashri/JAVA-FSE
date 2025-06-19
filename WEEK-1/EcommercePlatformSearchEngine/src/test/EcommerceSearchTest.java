package test;
import model.Product;
import search.SearchEngine;
public class EcommerceSearchTest {
    public static void main(String[] args) {
        Product[] products = {
            new Product(1, "Laptop", "Electronics"),
            new Product(2, "Shoes", "Footwear"),
            new Product(3, "Book", "Stationery"),
            new Product(4, "Watch", "Accessories"),
            new Product(5, "Phone", "Electronics")
        };

        String searchTarget = "Watch";

        System.out.println("🔍 Linear Search:");
        Product result1 = SearchEngine.linearSearch(products, searchTarget);
        System.out.println(result1 != null ? "Found: " + result1 : "Product not found");

        System.out.println("\n🔍 Binary Search:");
        Product result2 = SearchEngine.binarySearch(products, searchTarget);
        System.out.println(result2 != null ? "Found: " + result2 : "Product not found");
    }
}

