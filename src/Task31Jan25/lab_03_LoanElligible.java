package Task31Jan25;

import java.sql.SQLOutput;
import java.util.Scanner;

public class lab_03_LoanElligible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age in Integer");
        if(!sc.hasNextInt())
        {
            System.out.println("Invalid Age enter");
            sc.close();
            return;
        }
        int age = sc.nextInt();
        System.out.println("Enter Salary in double");
        if(!sc.hasNextDouble()) {
            System.out.println("Invalid Salary");
            sc.close();
            return;
        }
        double Salary= sc.nextDouble();
        System.out.println("Enter minimum salary required for loan");
        if(!sc.hasNextDouble()) {
            System.out.println("Invalid Salary");
            sc.close();
            return;
        }
        double MinSalary= sc.nextDouble();
        System.out.println("Enter Credit Score");
        if(!sc.hasNextInt())
        {
            System.out.println("Invalid Score");
            sc.close();
            return;
        }
        int Creditscore=sc.nextInt();
        System.out.println("Enter Minimum Credit Score");
        if(!sc.hasNextInt())
        {
            System.out.println("Invalid Score");
            sc.close();
            return;
        }
        int MinCreditscore=sc.nextInt();
        System.out.println("Enter Max Credit Score");
        if(!sc.hasNextInt())
        {
            System.out.println("Invalid Score");
            sc.close();
            return;
        }
        int MaxCreditscore=sc.nextInt();
        if(IsValid(age,Salary,Creditscore,MinSalary,MinCreditscore,MaxCreditscore)){
            System.out.println("Eligible for Loan");
        }
        else {
            System.out.println("Not Eligible for Loan");
        }
        sc.close();
        }
    public static boolean IsValid(int pAge,double pSalary, int pCreditScor, double pMinSalary,int pMinCredtiScor, int pMaxcreditScore){

        if(pAge < 0) {
                return false;
            }
            else if (pAge < 18 || pAge>80){
                return false;
            }
            else if(pSalary<0 ||pSalary<pMinSalary){
                return false;

            }
            else if (pCreditScor < pMinCredtiScor || pCreditScor <0){
                return false;
        }
            else {
                return true;
        }

        }
    }

