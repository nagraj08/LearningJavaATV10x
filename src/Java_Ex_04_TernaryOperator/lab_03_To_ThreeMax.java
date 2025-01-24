package Java_Ex_04_TernaryOperator;

public class lab_03_To_ThreeMax {
    public static void main(String[] args) {
        //Finding th emax of three number of n1,n2,n3

       int result = (Integer.parseInt(args[0]) >= Integer.parseInt(args[1]))?((Integer.parseInt(args[0])>=Integer.parseInt(args[2]))? Integer.parseInt(args[0]):Integer.parseInt(args[2])) :((Integer.parseInt(args[1])>=Integer.parseInt(args[2]))? Integer.parseInt(args[1]):Integer.parseInt(args[2]));

        //int result = (n1>=n2)?  ((n1>=n3)? n1:n3) :((n2>=n3)?n2:n3);
        System.out.println(result);

    }
}
