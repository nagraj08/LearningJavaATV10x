package Task015Feb25;

public class lab07_Cars {
    public static void main(String[] args) {

        Cars2 Tesla = new Cars2();
       Tesla.model="Tesla";
        Tesla.year=1950;
        //Tesla.
       // Tesla.Cars2("Telsa",1949);
        System.out.println(Tesla.model);
        System.out.println(Tesla.year);
        System.out.println("-------------");
        Cars2 nano = new Cars2();
      // nano.Cars2("Nano",1959);
        nano.model="Nano";
        nano.year=1959;
        System.out.println(nano.model);
        System.out.println(nano.year);
    }
}
