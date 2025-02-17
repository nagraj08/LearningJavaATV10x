package Task09Feb25;

import java.util.Arrays;

public class lab_02_Arrays {
    public static void main(String[] args) {
        int [] marks ={35,25,45,55,65,26};
        Arrays.sort(marks);
        for ( int i=0;i< marks.length;i++)
        {
            System.out.println(marks[i]);
        }
        }

        //String [] sorted = Arrays.sort(marks);
        //System.out.println(Arrays.sort(marks));

}
