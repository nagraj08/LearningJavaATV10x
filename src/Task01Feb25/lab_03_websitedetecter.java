package Task01Feb25;

import java.util.Scanner;

public class lab_03_websitedetecter {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Prompt user for the website URL
        System.out.println("Enter the website URL:");
        String url = sc.nextLine().toLowerCase(); // Convert to lowercase to handle case insensitivity

        // Determine the website type based on the domain extension
        if (url.endsWith(".com")) {
            System.out.println("The website type is: Commercial website");
        } else if (url.endsWith(".org")) {
            System.out.println("The website type is: Non-profit organization");
        } else if (url.endsWith(".edu")) {
            System.out.println("The website type is: Educational institution");
        } else if (url.endsWith(".gov")) {
            System.out.println("The website type is: Government website");
        } else if (url.endsWith(".net")) {
            System.out.println("The website type is: Network-related website");
        } else if (url.endsWith(".info")) {
            System.out.println("The website type is: Informational website");
        } else {
            System.out.println("The website type is: Unknown or other types of websites");
        }

        // Close the Scanner
        sc.close();
    }
}
