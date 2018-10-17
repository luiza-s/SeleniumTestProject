/**
 * Created by luiza.suryan on 9/11/2018.
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class ReadFileClass {
    public static void main(String[] args)throws IOException{
        FileReader fileReader = new FileReader("F:\\ReadfromThisfile.txt");
        BufferedReader bufferReader = new BufferedReader(fileReader);

        String textfromfile = null;
        while((textfromfile=bufferReader.readLine())!=null){
            System.out.println(textfromfile);
        }
        fileReader.close();
        // Close the BufferedReader object to prevent memory leak
        bufferReader.close();

    }

}
