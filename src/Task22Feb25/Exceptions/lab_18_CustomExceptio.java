package Task22Feb25.Exceptions;

public class lab_18_CustomExceptio {
    public static void main(String[] args) {
        Bank sbi = new Bank("INR",100);
        Bank HDFC = new Bank("INR",200);
        Bank icici = new Bank ("INR",300);
        Bank jp_chase = new Bank("USD",200);
        int result = sbi.add(jp_chase);
        int resutl1 = sbi.add(HDFC);
        System.out.println(result);
        System.out.println(resutl1);
    }
}
