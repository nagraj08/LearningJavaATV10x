package Task016Feb25.ENUM;

import java.net.URL;

public class lab_02_ENUM_AUTOMATION {
    public static void main(String[] args) {
        System.out.println(URLs.katalon);
        if(URLs.katalon.equals("katalon")){
            System.out.println("I want to do somethings");

        }

    }
}
enum URLs{
    google,restassured, vwo, katalon
}
