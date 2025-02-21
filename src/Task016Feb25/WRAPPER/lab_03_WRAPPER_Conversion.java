package Task016Feb25.WRAPPER;

public class lab_03_WRAPPER_Conversion {
    public static void main(String[] args) {
        String num = "10";
        //String  - > Wrapper conversion
        Integer a = Integer.parseInt(num);
        //String to Primitive
        int a3 = Integer.parseInt(num);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        Integer aa = Integer.valueOf("10");
        System.out.println(aa);
    }
}

