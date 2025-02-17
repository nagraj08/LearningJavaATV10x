package Task09Feb25;

import java.util.Arrays;

public class lab_06_Intr_2ndLargestnum {
    public static void main(String[] args) {
        int[] n = {3,1,2,3,3};
        Arrays.sort(n);
        System.out.println(n[n.length-2]);
    }
}
