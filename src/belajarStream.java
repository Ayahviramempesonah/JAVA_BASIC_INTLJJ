import javax.annotation.processing.Filer;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class belajarStream {
    public static void main(String[] args)throws IOException {
        // membuka file

        FileInputStream byteFile= new FileInputStream("input.txt");
        FileReader fileReader= new FileReader("input.txt");

//      MEMBACA FILE
        System.out.println((char) byteFile.read());
        System.out.println((char) fileReader.read());
  //      System.out.println(byteFile.read());
    //    System.out.println(fileReader.read());


//      MENUTUP FILE
        byteFile.close();
        fileReader.close();


        System.out.println("ini adalah akhir program");
    }
}
