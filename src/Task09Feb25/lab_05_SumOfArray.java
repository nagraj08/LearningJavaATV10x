package Task09Feb25;

public class lab_05_SumOfArray {
    public static void main(String[] args) {
        int [] num1 ={1,2,3};
         int sum=0;
         //for each loop eg as below only works for arrays and some part of collection frameworks
// it work only with increment and do not work with decrement
        for ( int i:num1)
        {
            sum = sum+i;
        }
                System.out.println("Sum of Array is "+sum);

            }
        }


