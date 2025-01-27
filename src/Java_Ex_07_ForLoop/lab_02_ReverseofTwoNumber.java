package Java_Ex_07_ForLoop;


    import java.util.Scanner;

    public class lab_02_ReverseofTwoNumber  {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int number = 0;
            System.out.print("Enter a number: ");
            if(scanner.hasNextInt()){
            number = scanner.nextInt();
            } else {
                System.out.println("Enter only Int");
                System.exit(0);
            }

            int reversed = 0;

            // Reverse the number using for loop
            for (int originalNum = number; originalNum != 0; originalNum /= 10) {
                int digit = originalNum % 10;
                reversed = reversed * 10 + digit;
            }

            System.out.println("Original Number: " + number);
            System.out.println("Reversed Number: " + reversed);

            scanner.close();
        }
    }
//}

