package principal;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Inversion {
    public static Scanner s = new Scanner(System.in);
    public static String FILE_NAME = "input.txt";
    public static void recorrer() {
        try {
            String texto = s.next();
            FileWriter output = new FileWriter(FILE_NAME);
            for(int i=texto.length()-1;i>=0;i--) {
                output.write(texto.charAt(i));
            }
            output.close();
        }catch (IOException ex) {
            System.out.println("Salió mal");
        }
    }
}
