import java.util.Scanner;

public class FinancialForecaster {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Simple Financial Forecaster ===");
        
       
        System.out.print("Initial amount: Rs");
        double amount = scanner.nextDouble();
        
        System.out.print("Annual growth rate (%): ");
        double rate = scanner.nextDouble() / 100;
        
        System.out.print("Years to forecast: ");
        int years = scanner.nextInt();
        
      
        System.out.println("\nYearly Projections:");
        for (int i = 0; i <= years; i++) {
            double projected = calculateFutureValue(amount, rate, i);
            System.out.printf("Year %2d: Rs%,10.2f%n", i, projected);
        }
        
        scanner.close();
    }

    
    public static double calculateFutureValue(double amount, double rate, int years) {
        if (years == 0) return amount;
        return calculateFutureValue(amount, rate, years - 1) * (1 + rate);
    }

   
    public static double calculateFutureValueIterative(double amount, double rate, int years) {
        return amount * Math.pow(1 + rate, years);
    }
}