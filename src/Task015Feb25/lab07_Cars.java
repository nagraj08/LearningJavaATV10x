package Task015Feb25;

public class lab07_Cars {
    public static void main(String[] args) {

//        Car Tesla = new Car();
//        Tesla.model="Tesla";
//        Tesla.year=1950;
        Car Telsa1 = new Car("Tesla",1949);
        System.out.println(Telsa1.model);
        System.out.println(Telsa1.year);
        System.out.println("-------------");
//        Car nano = new Car();
//        nano.model="Nano";
//        nano.year=1950;
        Car nano1 = new Car("Nano",1959);
        System.out.println(nano1.model);
        System.out.println(nano1.year);
    }
}
