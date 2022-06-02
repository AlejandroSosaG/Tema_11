package principal.POO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Lector {
    public static String FILE_NAME = "Reales";

    public static void recorrido() {
        BufferedReader entrada = null;
        Scanner s = null;
        String registro = "";
        double suma = 0;
        try {
            entrada = new BufferedReader(new FileReader(FILE_NAME));
            entrada.readLine();
            while (s.hasNextDouble() != false) {
                s = new Scanner(registro);
                suma += s.nextDouble();
            }
            entrada.close();
            System.out.println(suma);
        } catch (IOException ex) {
            System.out.println("Algo salió mal");
        }
    }
}
