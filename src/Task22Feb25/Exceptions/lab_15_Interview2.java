package Task22Feb25.Exceptions;

import java.io.*;



public class lab_15_Interview2 {
    public static void main(String[] args) throws IOException {
        File file = new File("E://abc.txt");
        String textToWrite = "Hello World!";
        if(file.exists()){// Check if file exists

            try {
                // Read file content by passing the file name in Filereader
                BufferedReader br = new BufferedReader(new FileReader(file));
                String line;
                boolean textexist = false;
                while((line=br.readLine())!=null)
                {
                    if(line.contains(textToWrite)){
                        textexist = true;
                        break;

                    }
                }
                br.close();
                if(textexist)
                {
                    System.out.println("Text already exist");
                }
                else {
                FileWriter fw = new FileWriter(file,true);
                fw.write("Hello World!");
                fw.close();
                System.out.println("Hello World! written to the file");}
            } catch (IOException e) {
                //throw new RuntimeException(e);
                System.out.println("Error writing to file: "+ e.getMessage());
            }


        }
        else {
            System.out.println("File not found:" +file.getAbsoluteFile());
        }

    }

}
