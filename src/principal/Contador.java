package principal;

import java.io.FileReader;
import java.io.IOException;

public class Contador {
    public static String Texto="input.txt";
    public static String Vocales="aeiou";
    public static void recorrido(){
        try {
            CharCounter contador= new CharCounter(Vocales,  false);
            FileReader input = new FileReader(Texto);
            int c = input.read();
            while (c!=-1){
                contador.contar((char) c);
                c= input.read();
            }
            input.close();
            System.out.println(contador.toString());
        }catch (IOException ex){
            System.out.println("Salió mal");
        }
    }
}
