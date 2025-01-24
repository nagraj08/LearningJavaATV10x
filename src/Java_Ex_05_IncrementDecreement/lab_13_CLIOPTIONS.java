package Java_Ex_05_IncrementDecreement;

public class lab_13_CLIOPTIONS {
    public static void main(String[] args) {
//        System.out.println("Max value between"+ Integer.parseInt(args[0] )+ "And" +Integer.parseInt(args[1])+ "is " +
//                Integer.parseInt(args[0]) >= Integer.parseInt(args[1])?Integer.parseInt(args[0]):
//        (Integer.parseInt(args[0])==Integer.parseInt(args[1]))?"Equal":Integer.parseInt(args[1]));
        // Validate the input
        if (args.length < 2) {
            System.out.println("Error: Please provide two integer arguments.");
            return;
        }

        try {
            // Parse input arguments
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);

            // Compare the two numbers and output result
            System.out.println("Max value between " + num1 + " and " + num2 + " is " +
                    (num1 > num2 ? num1 : num1 == num2 ? "Equal" : num2));
        } catch (NumberFormatException e) {
            System.out.println("Error: Please provide valid integers as arguments.");
        }

    }
}
