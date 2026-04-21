package com.pluralsight;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
public class BedtimeStoriesApp {

    public static void main(String[] args) {

    // create a scanner to take the input
        Scanner theScanner = new Scanner (System.in);

        // asking for the user's input
        System.out.print("Enter the name of a story ");
        String storyName = theScanner.nextLine();


        // I need to take the storyName variable and see if I can find a file
        // of the same name.

        try {
            FileReader fileReader = new FileReader("src/main/resources/" + storyName);
            // create a buffered reader and pass it the file reader
            BufferedReader bufReader = new BufferedReader(fileReader);

            String line;


            //while ((line = bufReader.readLine()) != null){
              //  System.out.println(line);
            //}

            int n = 1;
            while (true){

                String theLine = bufReader.readLine();
                if (theLine == null){
                    break;
                }

                System.out.println(n + ". " + theLine);
            }




        } catch (Exception e) {
            System.out.println("Can't find file");
        }



    }
}
