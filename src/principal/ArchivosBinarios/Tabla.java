package principal.ArchivosBinarios;

import java.io.*;

public class Tabla {
    public static void recorrido() {
        int [] tabla= {0,1,2,3,4,5,6,7,8,9};

        ObjectOutput salida = null;
        ObjectInput entrada = null;
        //Escritura
        try{
            salida = new ObjectOutputStream(new FileOutputStream("binarios.dat"));
            for(int i=0; i<tabla.length; i++) {
                salida.writeInt(tabla[i]);
            }

        }catch (IOException e){
            System.out.println(e);
        }
        finally {
            try {
                salida.close();
            }
            catch (IOException e){
                System.out.println(e);
            }
        }
        //Lectura
        try {
            entrada = new ObjectInputStream(new FileInputStream("binarios.dat"));
            while (true) {
                System.out.println(entrada.readInt());
            }
        }
        catch (IOException e){
            System.out.println("Final");
        }
        finally {
            try {
                entrada.close();
            }
            catch (IOException e){
                System.out.println("FINAL");
            }
        }
    }
}