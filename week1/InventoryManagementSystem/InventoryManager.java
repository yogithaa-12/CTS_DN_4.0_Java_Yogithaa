import java.util.ArrayList;
import java.util.List;

public class InventoryManager {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
        System.out.println("Product added successfully!");
    }

    public void updateProduct(int id, String newName, int newQty, double newPrice) {
        for (Product p : products) {
            if (p.getProductId() == id) {
                p.setProductName(newName);
                p.setQuantity(newQty);
                p.setPrice(newPrice);
                System.out.println("Product updated successfully!");
                return;
            }
        }
        System.out.println("Product with ID " + id + " not found.");
    }

    public void deleteProduct(int id) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getProductId() == id) {
                products.remove(i);
                System.out.println("Product deleted successfully!");
                return;
            }
        }
        System.out.println("Product with ID " + id + " not found.");
    }

    public void showAllProducts() {
        if (products.isEmpty()) {
            System.out.println("No products in inventory.");
            return;
        }
        System.out.println("\nCurrent Inventory:");
        for (Product p : products) {
            System.out.println(p);
        }
    }
}