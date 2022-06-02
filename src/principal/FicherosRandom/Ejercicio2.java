package principal.FicherosRandom;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio2 {
    public static String FILE_NAME="Perro.txt";
    List array= new ArrayList();
    public static void recorrido() throws IOException {
        RandomAccessFile file = null;
        try {
            file=new RandomAccessFile(FILE_NAME, "rw");
            file.writeInt(5);
            long posicion=file.getFilePointer();
            file.writeInt(75);
            file.writeInt(7);
            posicion=file.getFilePointer();
            file.writeInt(7);
            file.writeInt(7);

            file.seek(posicion);
            while (true)
                System.out.println(file.readInt());
        }catch (IOException e){
            System.out.println("Final");
        }finally {
            file.close();
        }
    }
}
