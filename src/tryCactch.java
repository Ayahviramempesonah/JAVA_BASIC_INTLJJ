import java.util.Scanner;
import java.util.Arrays;
import java.io.IOException;





public class tryCactch {
    public static void main(String[] args) {
        // kita akan belajar try,catch dan finally
        int [] arraySatu={1,2,3,4,5,6,7};
        System.out.println(arraySatu[3]);

        Scanner userInput=new Scanner(System.in);
        System.out.println("masukkan nilai");
        int index=userInput.nextInt();

        System.out.println(" handling out of bound");
        try{
            System.out.printf("index ke %d, adalah %d\n",index,arraySatu[index]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.err.println(e);
        }








    }

}
