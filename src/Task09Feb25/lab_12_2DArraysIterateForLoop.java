package Task09Feb25;

public class lab_12_2DArraysIterateForLoop {
    public static void main(String[] args) {
        int [][] matrix = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        //r--3
        //C--3
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++)
            {
                System.out.print(matrix[i][j]+"|");
            }
            System.out.println();
        }
    }
}
