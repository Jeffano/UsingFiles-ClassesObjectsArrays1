import java.io.*;
import java.util.*;

public class FileDisplay {

    //Initializing a string
    String fileName;


    //Creating an object of the file
    File f = new File("fileName.txt");

    //Creating a constructor to this class
    FileDisplay(String fileName){
        this.fileName = fileName;
    }

    //Creating a method to display the lines
    public void display(){

        //Scanner to read from the file
        Scanner inputFile;
        {
            //Using try and catch to catch the exception
            try {
                inputFile = new Scanner(f);
                System.out.println("Prints All The Lines");
                //Uses a while loop to print line by line from the file
                while (inputFile.hasNext()){
                    String str = inputFile.nextLine();
                    System.out.println(str);
                }
                //Closes the file
                inputFile.close();
            }

            //Catches the exception
            catch (FileNotFoundException e) {
                System.out.println("The file does not exist");
            }
        }
    }

    //A display method but only displays up to a certain number of lines
    public void display(int n){
        Scanner inputFile;
        {
            try {
                inputFile = new Scanner(f);
                //Initializing line 1
                int i = 1;
                System.out.println("\nPrints The Available Lines Up Till " + n);

                //Printing the lines up till number n using a while loop
                while (inputFile.hasNext()){
                    //Uses an if statement to check if the number of lines is less than the number n
                    if (i <= n){
                        String str = inputFile.nextLine();
                        System.out.println(str);
                        //Counts the number of lines printed
                        i++;
                    }
                    else{
                        //breaks if the next printed line is greater than n
                        break;
                    }
                }
                //closes  the file
                inputFile.close();
            }
            //Catches the exception
            catch (FileNotFoundException e) {
                System.out.println("The file does not exist");
            }
        }
    }

    //Prints the lines from a certain line to another certain line
    public void display(int from, int to){
        Scanner inputFile;
        {
            try {
                inputFile = new Scanner(f);
                int i = 1;
                System.out.println("\nPrints The Lines From Line:" + from + " to Line:" + to);
                //Using a while loop to check if next line is available
                while (inputFile.hasNext()) {
                    //Stores the next line into a string
                    String str = inputFile.nextLine();
                    //Checks if the line stored number is greater then from and less than to
                    if (i >= from && i <= to) {
                        //Prints the line
                        System.out.println(str);
                    }
                    //Counts of lines passed
                    i++;
                }
                //Closes the file
                inputFile.close();

            }
            //Catches the exception
            catch (FileNotFoundException e) {
                System.out.println("The file does not exist");
            }
        }
    }
}
