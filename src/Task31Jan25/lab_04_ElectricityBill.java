package Task31Jan25;

import java.util.Scanner;

public class lab_04_ElectricityBill {
    public static void main(String[] args) {
//        18 )  Electricity Bill Calculation (Based on Units Consumed)//
//           :- take the input from the user of Units.// Implement Rate Structure://
//        Define the rate structure for calculating the bill based on the number of units consumed.//
//            :-  First 100 units: 0.50Rs per unit//// :-  Next 100 units (101-200): 0.75Rs per unit//
//        :- Next 100 units (201-300): 1.20Rs per unit//
//        :- Above 300 units: 1.50Rs per unit
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the units of consumption");
        if(!sc.hasNextDouble())
        {
            System.out.println("Invalid Units");
            sc.close();
            return;
        }
        double units = sc.nextDouble();
        System.out.println("Your current bill for "+units+" units is "+currentbill(units)+"Rs.");
        sc.close();

    }
    public static double currentbill( double units){

        if (units < 0) {
            System.out.println("Error: Units cannot be negative");
            return -1; // Indicates invalid input
        }

        double total = 0.00;

        // Tier 4: Above 300 units
        if (units > 300) {
            total += (units - 300) * 1.50;
            units = 300; // Remaining units to process
        }

        // Tier 3: 201-300 units
        if (units > 200) {
            total += (units - 200) * 1.20;
            units = 200;
        }

        // Tier 2: 101-200 units
        if (units > 100) {
            total += (units - 100) * 0.75;
            units = 100;
        }

        // Tier 1: First 100 units
        total += units * 0.50;
return total;
    }
}
