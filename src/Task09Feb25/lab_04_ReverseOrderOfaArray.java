package Task09Feb25;

import java.util.Arrays;

public class lab_04_ReverseOrderOfaArray {
    public static void main(String[] args) {
        int [] num = {9,4,6,12,34};
        Arrays.sort(num);
        for (int i = num.length-1;i>=0;i--)
        {
            System.out.println(num[i]);
        }
    }
}
