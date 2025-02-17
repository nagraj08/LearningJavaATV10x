package Task09Feb25;

import java.util.Arrays;

public class lab_11_2DInterviewArray {
    public static void main(String[] args) {
        int [][] matrix= new int[][] {{1,2,3},{4,5,6},{7,8,9}};
        int [][] matrix2= new int [][]{{1,2},{3,4}};
        int [][] matrix3= new int [][]{{1},{2},{3}};

//        System.out.println(Arrays.deepToString(matrix));
//        System.out.println(Arrays.deepToString(matrix2));
//        System.out.println(Arrays.deepToString(matrix3));
        System.out.println(formatMatrix(matrix));
        System.out.println(formatMatrix(matrix2));
        System.out.println(formatMatrix(matrix3));
    }

    private static String formatMatrix(int[][] matrix) {
        return Arrays.deepToString(matrix)
                .replace('[','{')
                .replace(']','}');



    }
}
