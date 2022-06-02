package principal.ClaseFile;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3 {
    public static Scanner s = new Scanner(System.in);
    public static void recorrido(){
        System.out.println("Introduzca nombre del directorio: ");
        String dir = s.next();
        File file = new File(dir);
        String[] array = file.list();
        for (int i = 0; i < array.length; i++) {
            file = new File(dir, array[i]);
            if (file.isDirectory()){
                System.out.println(file.getName() + " es un directorio");
            }else System.out.println(file.getName() + " es un fichero");
        }
    }
}
