package Java_Ex_04_TernaryOperator;

public class lab_02_nestedTernary {
    public static void main(String[] args) {
        //Nested Ternary
        int n = 55;
        //String canIvote = age > 18 ? "Yes" : "No";
        String result =  n >=90 && n<=100  ?"grade A" : (((n >= 80 && n <=89) ? " grade B"
                : (n >= 70 && n <=79) ? " grade C" : (n >= 60 && n <=69) ? " grade D" : "grade f"));
        System.out.println(result);
    }
}
