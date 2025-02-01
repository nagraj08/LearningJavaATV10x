package Task31Jan25;

import java.util.Scanner;

public class lab_06_TaxOnNetSalary {
    // Salary components as percentages of Basic Pay
    private static final double HRA_PERCENT = 0.30; // 30% of Basic
    private static final double DA_PERCENT = 0.08;  // 8% of Basic

    // Income Tax Slabs (Monthly)
    private static final double TAX_SLAB_1 = 25000;  // 0% tax
    private static final double TAX_SLAB_2 = 50000;  // 5% tax on amount above 25k
    private static final double TAX_SLAB_3 = 100000; // 10% tax on amount above 50k
    // 15% tax on amount above 1L

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Employee's Basic Pay (Monthly): ₹");
        double basicPay = scanner.nextDouble();
        scanner.close();

        if (basicPay <= 0) {
            System.out.println("Invalid Basic Pay!");
            return;
        }

        // Calculate salary components
        double hra = basicPay * HRA_PERCENT;
        double da = basicPay * DA_PERCENT;
        double grossSalary = basicPay + hra + da;

        // Calculate tax based on slabs
        double tax = calculateTax(grossSalary);

        double netSalary = grossSalary - tax;

        // Display results
        System.out.println("\nSalary Breakdown:");
        System.out.printf("Basic Pay: ₹%.2f%n", basicPay);
        System.out.printf("HRA (30%%): ₹%.2f%n", hra);
        System.out.printf("DA (8%%): ₹%.2f%n", da);
        System.out.printf("Gross Salary: ₹%.2f%n", grossSalary);
        System.out.printf("Tax Deducted: ₹%.2f%n", tax);
        System.out.printf("Net Salary: ₹%.2f%n", netSalary);
    }

    private static double calculateTax(double grossSalary) {
        double taxableAmount = grossSalary;
        double tax = 0;

        // Tier 4: Above ₹1,00,000 (15% tax)
        if (taxableAmount > TAX_SLAB_3) {
            tax += (taxableAmount - TAX_SLAB_3) * 0.15;
            taxableAmount = TAX_SLAB_3;
        }

        // Tier 3: ₹50,001 to ₹1,00,000 (10% tax)
        if (taxableAmount > TAX_SLAB_2) {
            tax += (taxableAmount - TAX_SLAB_2) * 0.10;
            taxableAmount = TAX_SLAB_2;
        }

        // Tier 2: ₹25,001 to ₹50,000 (5% tax)
        if (taxableAmount > TAX_SLAB_1) {
            tax += (taxableAmount - TAX_SLAB_1) * 0.05;
        }

        return tax;
    }
}
