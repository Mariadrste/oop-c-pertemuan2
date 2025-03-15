package JavaApplication22;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/**
 *
 * @author Maria Droste
 * TGL: 15 Maret 2025
 */
public class JavaApplication22{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String mhs = "Maria Droste";
       long nim = 2301010355L;
       
       BufferedReader dtIN = new BufferedReader (new InputStreamReader(System.in));
       try{
           
           System.out.print("Input Nama Mahasiswa: ");
           mhs = dtIN.readLine();
           
           System.out.print("Input NIM: ");
           nim = Long.parseLong( dtIN.readLine () );
           
       }catch(IOException e){
           System.out.println("Lautan yang sangat indah");
       }
       
       System.out.println("Data "+mhs+" dengan NIM " +nim);
       
    
    }

}
