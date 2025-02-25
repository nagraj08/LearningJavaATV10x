package Task22Feb25.Generics;

public class lab_03_Generic3 {
    public static void main(String[] args) {
    //temp_sum("Nagraj ","Bitla");
    //temp_sum(1900,78);
        System.out.println("This is "+temp_sum("Nagraj ","Bitla")+" and age is "+temp_sum(1900,78));
    }
    static Integer temp_sum(Integer a,Integer b){
return a+b;

    }
    static String temp_sum(String a,String b){
        return a+b;
    }
}
