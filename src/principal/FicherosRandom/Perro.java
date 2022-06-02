package principal.FicherosRandom;

enum Raza{Chihuahua, Terrier, Galgo, Ale, David}

public class Perro {
    int id;
    String nombre;
    Raza raza;
    boolean conChapa;
    String color;
    int edad;

    public Perro(int id, String nombre, Raza raza, boolean conChapa, String color, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.raza = raza;
        this.conChapa = conChapa;
        this.color = color;
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Raza getRaza() {
        return raza;
    }

    public void setRaza(Raza raza) {
        this.raza = raza;
    }

    public boolean isConChapa() {
        return conChapa;
    }

    public void setConChapa(boolean conChapa) {
        this.conChapa = conChapa;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Perro{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", raza=" + raza +
                ", conChapa=" + conChapa +
                ", color='" + color + '\'' +
                ", edad=" + edad +
                '}';
    }
}
