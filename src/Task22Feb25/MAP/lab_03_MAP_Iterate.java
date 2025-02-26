package Task22Feb25.MAP;
import java.util.*;
public class lab_03_MAP_Iterate {
    public static void main(String[] args) {


        Map<String, Integer> map = new HashMap();
        map.put("id", 1);
        map.put("id2",2);
        map.put("id3", 3);
        map.put("id4",4);
        map.put("id5", null);
        map.put("id6",null);
        map.put(null, 100);

        //Iterate , For Loop, x, EntrySet, Iterator - x
        for(Map.Entry<String,Integer> item:map.entrySet()){
            System.out.println(item.getKey()+ " -> " + item.getValue());

        }




    }
}
