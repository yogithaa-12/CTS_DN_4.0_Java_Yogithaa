import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Shirt", "Apparel"),
            new Product(103, "Coffee", "Grocery"),
            new Product(104, "Shoes", "Footwear"),
            new Product(105, "Mobile", "Electronics")
        };

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter product name to search: ");
        String searchName = sc.nextLine();

        System.out.println("\n--- Linear Search ---");
        Product result1 = SearchService.linearSearch(products, searchName);
        if (result1 != null)
            System.out.println("Found: " + result1);
        else
            System.out.println("Product not found");

        System.out.println("\n--- Binary Search ---");
        Product result2 = SearchService.binarySearch(products, searchName);
        if (result2 != null)
            System.out.println("Found: " + result2);
        else
            System.out.println("Product not found");

        sc.close();
    }
}
