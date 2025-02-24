package Task22Feb25.List;

import java.util.ArrayList;
import java.util.List;




public class lab_01_List {
    public static void main(String[] args) {
        List fruits = new List.of("Apple","Orange","pineapple");
        //static methofs can be fully implemented i Interface
        //Default method can be fully implemented in Interfac
        fruits.add("Cherry");//cannto add
        fruits.remove("apple");//cannot remove
        ArrayList arrayList = new ArrayList();
        arrayList.add("nagraj");
        arrayList.add("bitla");
                        System.out.println(arrayList);

        System.out.println(arrayList.size());


    }
}
