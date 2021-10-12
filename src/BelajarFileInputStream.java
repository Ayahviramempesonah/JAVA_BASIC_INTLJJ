import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileInputStream;
public class BelajarFileInputStream {
    public static void main(String[] args)throws IOException {

        FileInputStream fileInputStream=new FileInputStream("input.txt");
        System.out.println(fileInputStream.available());

long waktuStart,waktuFinish;
waktuStart=System.nanoTime();
        System.out.println(fileInputStream.readAllBytes());
waktuFinish=System.nanoTime();
        System.out.println("waktu yang dibutuhkan adalah"+(waktuFinish - waktuStart));
fileInputStream.close();

    }
}
