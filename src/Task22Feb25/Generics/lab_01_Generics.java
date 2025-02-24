package Task22Feb25.Generics;

import java.util.stream.StreamSupport;

public class lab_01_Generics {
    public static void main(String[] args) {
        temp(23, 45);
        temp("A",1);
    }
    public static <T> T temp(T a,T b){
        System.out.println(a);
        System.out.println(b);
        return null;
    }

}

