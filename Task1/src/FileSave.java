import java.io.*;

public class FileSave {

    //Initializing a string variable
    String file;

    //Creating an object of the file
    FileSave(String fileContent) {
        this.file = fileContent;
    }

    //Method to save the line into a file and catches exception
    public void save(String line) throws IOException {
        //Creating and naming the file and opens it
        FileWriter fw = new FileWriter("fileName.txt", false);
        PrintWriter pw = new PrintWriter(fw);
        //Prints the information onto the file
        pw.println(line);
        //Closes the file
        pw.close();
    }

}
