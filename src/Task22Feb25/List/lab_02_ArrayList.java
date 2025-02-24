package Task22Feb25.List;
import java.util.ArrayList;
import java.util.List;
public class lab_02_ArrayList {
    public static void main(String[] args) {
ArrayList A= new ArrayList();
A.add("1");
        A.add("1");
        A.add("2");
        A.add("3");
        System.out.println(A.size());
        System.out.println(A.indexOf(3));
        System.out.println(A.isEmpty());
        System.out.println(A);
        System.out.println(A.contains("1"));
        System.out.println(A.lastIndexOf(3));
        for(int i =0;i<A.size()-1;i++){
            System.out.println(A.get(i));
        }


    }
}
