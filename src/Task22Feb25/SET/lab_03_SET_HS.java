package Task22Feb25.SET;
import java.util.HashSet;
public class lab_03_SET_HS {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Orange");
        set.add("Apple");
        set.add("Banana");
        set.add("Apple");
        System.out.println("Set elements: " + set);
    }
}
