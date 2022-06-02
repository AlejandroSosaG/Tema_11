package principal.ClaseFile;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {
    public static Scanner s = new Scanner(System.in);
    public static void recorrido(){
        System.out.println("Introduzca nombre del directorio: ");
        String dir = s.next();
        File file = new File(dir);
        if (file.isDirectory()) {
            System.out.println(Arrays.toString(file.list()));
        } else System.out.println("No es un directorio");
    }
}
