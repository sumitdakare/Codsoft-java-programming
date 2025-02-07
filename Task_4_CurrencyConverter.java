import java.util.Scanner;

public class CurrencyConverter {

    // Method to fetch exchange rates (Hardcoded for simplicity)
    public static double getExchangeRate(String base, String target) {
        switch (base + "-" + target) {
            case "USD-EUR": return 0.92;
            case "USD-INR": return 74.5;
            case "EUR-USD": return 1.09;
            case "EUR-INR": return 81.3;
            case "INR-USD": return 0.013;
            case "INR-EUR": return 0.012;
            default: return 1.0; // Same currency conversion
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display available currencies
        System.out.println("=====================================");
        System.out.println("      CURRENCY CONVERTER");
        System.out.println("=====================================");
        System.out.println("Available Currencies: USD, EUR, INR");

        // User inputs
        System.out.print("Enter Base Currency (USD/EUR/INR): ");
        String baseCurrency = scanner.next().toUpperCase();

        System.out.print("Enter Target Currency (USD/EUR/INR): ");
        String targetCurrency = scanner.next().toUpperCase();

        System.out.print("Enter Amount to Convert: ");
        double amount = scanner.nextDouble();

        // Perform conversion
        double rate = getExchangeRate(baseCurrency, targetCurrency);
        double convertedAmount = amount * rate;

        // Display result
        System.out.println("-------------------------------------");
        System.out.printf("Converted Amount: %.2f %s%n", convertedAmount, targetCurrency);
        System.out.println("=====================================");

        scanner.close();
    }
}
