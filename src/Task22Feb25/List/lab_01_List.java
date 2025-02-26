package Task22Feb25.List;

import java.util.ArrayList;
import java.util.List;

import static java.util.List.*;


public class lab_01_List {
    public static void main(String[] args) {
        List fruits = List.of("orange","apple","banana","mango","watermelon");
        System.out.println(fruits);

        //static methods can be fully implemented in Interface
        //Default method can be fully implemented in Interface
        //fruits.add("Cherry");//java.lang.UnsupportedOperationException
        //fruits.remove("apple");//cannot remove
        ArrayList arrayList = new ArrayList();
        arrayList.add("Nagraj");
        arrayList.add(null);
        arrayList.add("Bitla");
        arrayList.add("Bitla");//Duplicate is allowed in List
        arrayList.add(123);//Different Data type is allowed in list
        System.out.println(arrayList);
        System.out.println(arrayList.size());

        List l = new ArrayList();//Dynamic Dispatc
        l.add(123);
        l.add(456);
        System.out.println(l);



    }
}
