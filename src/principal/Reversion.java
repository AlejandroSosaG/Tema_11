package principal;

import java.io.*;
import java.util.Locale;
import java.util.Scanner;

public class Reversion {
    public static Scanner s = new Scanner(System.in);
    private static String normal = "texto.txt";
    private static String revertido = "Reverso.txt";

    private static String mayusculas(String linea) {
        return linea.toUpperCase();
    }

    public static void revertir() {
        try {
            BufferedReader entrada = new BufferedReader(new FileReader(normal));
            BufferedWriter salida = new BufferedWriter(new FileWriter(revertido));
            String linea = entrada.readLine();
            while (linea != null) {
                String revertida = mayusculas(linea);
                salida.write(revertida, 0, revertida.length());
                salida.newLine();
                linea = entrada.readLine();
            }
            entrada.close();
            salida.close();
        } catch (IOException ex) {
            System.out.println("Oh Ohhh");
        }
    }
}
