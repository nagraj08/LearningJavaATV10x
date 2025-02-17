package Task015Feb25;

public class Cars2 {
    String model;
    int year;




   //Default Constructor
     public Cars2(){
        model="XYX";
        year=0;
        System.out.println("DC");
    }
    //Parameterised Constructor
     public Cars2(String model_name, int year_created){
        this.model=model_name;
        this.year=year_created;
    }
}
