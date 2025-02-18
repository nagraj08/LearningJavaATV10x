package Task018Feb25;

public class InterviewQuestion {
    public static void main(String[] args) {
        String str = "vision withoutt without action is day dream";
        String[] strarray = str.split(" ");
        String smallStr = strarray[0];
        String longStr = strarray[0];
        for (int i = 0; i < strarray.length - 1; i++) {

            if (strarray[i].length() < smallStr.length())
            {
                smallStr = strarray[i];
            }
            if (strarray[i].length()>longStr.length())
            {
                longStr = strarray[i];
            }




            }

        System.out.println("Small String is " + smallStr.toUpperCase());
        System.out.println("Long String is " + longStr.toUpperCase());
        }

    }


