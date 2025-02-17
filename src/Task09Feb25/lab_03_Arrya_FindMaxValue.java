package Task09Feb25;

import java.util.Arrays;

public class lab_03_Arrya_FindMaxValue {
    public static void main(String[] args) {
        int [] array = {789,23,65,6,0,25,555};
        Arrays.sort(array);
//        for (int i =0; i< array.length;i++) {
//            System.out.println(array[i]);
//        }
        System.out.println("Max of Array is -->"+givemax(array));
        System.out.println("Min of Array is -->"+givemin(array));
    }

    private static int givemax(int[] array) {
        int max=0;
        for ( int i =0;i<array.length;i++)
        {
            if( array[i]>max) {
                 max = array[i];
            }
        }
        return max;
    }

    private static int givemin(int[] array) {
        int min=0;
        for ( int i =0;i<array.length;i++)
        {
            if( array[i]<min) {
                min = array[i];
            }
        }
        return min;
    }

}
