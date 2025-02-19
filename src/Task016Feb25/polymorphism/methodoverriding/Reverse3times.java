package Task016Feb25.polymorphism.methodoverriding;

import java.util.Arrays;

public class Reverse3times {
    public static void main(String[] args) {
        /*
TODO: - [ ] Write a simple java program ( Allowed to use IntelliJ )
  Rotate an array of integers 3 time and after each rotation last item should come at first place
  and all the other items should shift to next place ”
  Input : { 1,2,3,4,5,6,7} Output : {7,1,2,3,4,5,6} , {6,7,1,2,3,4,5}, {5,6,7,1,2,3,4}
 */
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int counter = 3;
        for (int i = 1; i <= counter; i++) {
            int reverse_num= arr[6];
            for (int j = arr.length - 1; j > 0; j--) {
                arr[j] = arr[j-1];

            }
            arr[0]=reverse_num;
            System.out.println(Arrays.toString(arr));
        }

    }
}

