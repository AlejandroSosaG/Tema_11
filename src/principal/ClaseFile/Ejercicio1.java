package principal.ClaseFile;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio1 {
    public static Scanner s = new Scanner(System.in);

    public static void recorrido() {
        System.out.println("Introduzca nombre del fichero: ");
        String archivo = s.next();
        File file = new File(archivo);
        System.out.println("Nombre: "+ file.getName());
        System.out.println("Ruta con la que se creó: "+ file.getPath());
        System.out.println("Ruta absoluta: " + file.getAbsolutePath());
        System.out.println("Directorio padre: " + file.getParent());
        if (file.exists()) {
            System.out.println("El fichero existe");
            if (file.canWrite()) System.out.println("Es de escritura");
            if (file.canRead()) System.out.println("Es de lectura");
            if (file.isDirectory()) System.out.println("Es un directorio");
            System.out.println("Tamaño en bytes: " + file.length());
        } else System.out.println("El fichero no existe");
    }
}
