package Task016Feb25;

public class lab_01_AbstractClass {
    public static void main(String[] args) {
    PrintMyBook myBook = new PrintMyBook();
    myBook.getDetails("Harry Potter", "J.K.Aowling", " 120");
    }
}
abstract class book {
    public abstract void getDetails(String Name,String Author, String Price);
}

class PrintMyBook extends book{


    @Override
    public void getDetails(String Name, String Author, String Price) {
        System.out.println(Name + Author + Price);

    }
}
