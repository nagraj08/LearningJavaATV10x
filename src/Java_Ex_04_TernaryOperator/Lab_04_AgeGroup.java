package Java_Ex_04_TernaryOperator;

public class Lab_04_AgeGroup {
    public static void main(String[] args) {
        int age = 19;
        String result = age < 18 ? "Minor" : ((age < 65) ?"Major" : "Senior");
        int x=10;
        int y=20;
        int max= x > y? x: y;
        System.out.println(max);
    }
}
