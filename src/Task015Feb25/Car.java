package Task015Feb25;

class Car {
    String model;
    int year;

   //Default Constructor
     Car(){
        model="XYX";
        year=0;
        System.out.println("DC");
    }
    //Parameterised Constructor
     Car(String model_name, int year_created)
     {
        this.model=model_name;
        this.year=year_created;
    }
}
