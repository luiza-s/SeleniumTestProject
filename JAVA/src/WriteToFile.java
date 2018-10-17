/**
 * Created by luiza.suryan on 9/12/2018.
 */
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class WriteToFile {
    public static void  main(String[] args)throws IOException{
        String textToWrite = "Es sovorum em java1";
        // Import BufferedWriter and FileWriter classes
 /* BufferedWriter writes text to a character-output stream, buffering characters
 so as to provide for the efficient writing of single characters, arrays, and strings. */
        //Import FileWriter and BufferedWriter class

        BufferedWriter writer = new BufferedWriter(new FileWriter("F:\\WriteToFile.txt"));
        writer.write(textToWrite);
        // Close the BufferedWriter object to prevent memory leak
        writer.close();
    }
}
