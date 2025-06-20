import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nInventory Management System");
            System.out.println("1. Add Product");
            System.out.println("2. Update Product");
            System.out.println("3. Delete Product");
            System.out.println("4. Show Products");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            
            try {
                choice = sc.nextInt();
                sc.nextLine(); // Consume newline

                switch (choice) {
                    case 1:
                        System.out.print("Enter ID: ");
                        int id = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter Name: ");
                        String name = sc.nextLine();
                        System.out.print("Enter Quantity: ");
                        int qty = sc.nextInt();
                        System.out.print("Enter Price: ");
                        double price = sc.nextDouble();
                        manager.addProduct(new Product(id, name, qty, price));
                        break;
                    case 2:
                        System.out.print("Enter ID to update: ");
                        id = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter new Name: ");
                        name = sc.nextLine();
                        System.out.print("Enter new Quantity: ");
                        qty = sc.nextInt();
                        System.out.print("Enter new Price: ");
                        price = sc.nextDouble();
                        manager.updateProduct(id, name, qty, price);
                        break;
                    case 3:
                        System.out.print("Enter ID to delete: ");
                        id = sc.nextInt();
                        manager.deleteProduct(id);
                        break;
                    case 4:
                        manager.showAllProducts();
                        break;
                    case 5:
                        System.out.println("Exiting program...");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter numbers only.");
                sc.nextLine(); 
                choice = 0;
            }
        } while (choice != 5);

        sc.close();
    }
}