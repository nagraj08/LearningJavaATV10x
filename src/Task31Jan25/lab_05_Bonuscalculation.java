package Task31Jan25;

import java.util.Scanner;

public class lab_05_Bonuscalculation {
    public static void main(String[] args) {
        //  Calculate Bonus Based on Salary and Years of Experience.
//          :- take the salary and Year info from the User.Implement Bonus Calculation Logic:
//        Define the bonus structure based on salary and years of experience.
//           :- If years of experience is less than 1 year: No bonus.
//           :- If years of experience is between 1 and 3 years: Bonus is 5% of the salary.
//           :- If years of experience is between 4 and 6 years: Bonus is 10% of the salary.
//           :- If years of experience is greater than 6 years: Bonus is 15% of the salary.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your years of experience");
        if(!sc.hasNextInt())
        {
            System.out.println("Invalid years enter");
            sc.close();
            return;
        }
        int yearsofexp= sc.nextInt();
        System.out.println("Enter your salary");
        if(!sc.hasNextDouble())
        {
            System.out.println("Invalid salary enter");
            sc.close();
            return;
        }
        double salary= sc.nextDouble();
        double bonus = 0.00;
        System.out.println(" Your experience is "+yearsofexp+ " years so your bonus is "+Bonus(yearsofexp,salary,bonus)+"Rs.");
        sc.close();
    }
    public static double Bonus(int yearsofexp, double sal,double bonus){
        if(yearsofexp <1){
             bonus=0.00;
        }
        else if(yearsofexp>=1 && yearsofexp<=3){
             bonus = ((5*sal)/100);

        }
        else if(yearsofexp>3 && yearsofexp<=6){
            bonus = ((10*sal)/100);

        }
        else {
            bonus=((15*sal)/100);
        }
return bonus;
    }
}
