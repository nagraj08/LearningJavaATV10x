package Task015Feb25;

public class lab_05_cats {
    public static void main(String[] args) {
    cats s1 = new cats();
    cats s2= null ;
    new cats();
    s1.running();
    s2.running();
    }
}
class  cats {
    String name;
    void running(){
        System.out.println("running..");
    }
}
