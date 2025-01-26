package Java_Ex_07_ForLoop;

public class lab_01_FOrLoop {
    public static void main(String[] args) {
        //ICU
        for (int i=0;i<=50;i++) {
            if (i % 2 == 0) {
                System.out.println("Even -> " + i);
            }
            else {
                System.out.println("Odd ->"+i);
            }
        }
    }
}
