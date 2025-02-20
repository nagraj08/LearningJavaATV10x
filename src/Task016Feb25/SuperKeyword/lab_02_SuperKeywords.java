package Task016Feb25.SuperKeyword;

public class lab_02_SuperKeywords {
    public static void main(String[] args) {
        Son s1 = new Son();
        s1.t1();
    }
}
class Father {
    Father() {
        System.out.println("DC Father");
    }

    int gold = 10;

    void home() {
        System.out.println("Home Father");
    }
}

class Son extends Father {

    Son() {
        super();
        System.out.println(gold);
    }

    void t1() {
        super.home();
        System.out.println(super.gold);
    }
}