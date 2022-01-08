/**
 * Name: Jeffano John
 * Date: Nov. 20th 2021
 * Student #: 251230759
 * Description: This program creates a file, prints a number of lines onto the file, prints up to a certain number of
 * lines and prints from and to a number of line.
 */
import java.io.IOException;

public class FilesDemo {
    public static void main(String[] args) throws IOException {

        //Creating the file display and file save objects
        FileDisplay fd = new FileDisplay("lines.txt");
        FileSave fs = new FileSave("lines.txt");

        //Using fs object to save the text to a file
        fs.save("1-Lorem ipsum dolor sit amet \n" +
                "2-Consectetuer adipiscing elit\n" +
                "3-Sed diam nonummy nibh euismod tincidunt\n" +
                "4-Ut wisi enim ad minim veniam\n" +
                "5-Quis nostrud exerci tation ullamcorper\n" +
                "6-Suscipit lobortis nisl ut aliquip ex ea commodo consequat\n" +
                "7-Duis autem vel eum iriure dolor in hendrerit\n" +
                "8-Vel illum dolore eu feugiat nulla facilisis at vero eros"
        );

        //Using the objects to print the all the lines or a specific number of lines
        fd.display();
        fd.display(3);
        fd.display(10);
        fd.display(3,5);
    }
}
