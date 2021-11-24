package zooAnimales;
import java.util.ArrayList;

public class Mamifero extends Animal {
    public static ArrayList<Mamifero> mamiferos = new ArrayList<Mamifero>();
    public static int caballos;
    public static int leones;
    private boolean pelaje;
    private int patas;

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    public boolean isPelaje() {
        return pelaje;
    }

    public void setPelaje(boolean pelaje) {
        this.pelaje = pelaje;
    }

    public Mamifero() {
        super(null, 0, null, null);
    }

    public Mamifero(String nombre, int edad, String habitat, String genero, Boolean pelaje, int patas) {
        super(nombre, edad, habitat, genero);
        this.pelaje = pelaje;
        this.patas = patas;
        mamiferos.add(this);
    }

    public int cantidadMamiferos() {
        return mamiferos.size();
    }

    public static Mamifero crearCaballo(String nombre, int edad, String genero) {
        Mamifero caballo = new Mamifero(nombre, edad, "pradera", genero, true, 4);
        caballos++;
        return caballo;
    }

    public static Mamifero crearLeon(String nombre, int edad, String genero) {
        Mamifero leon = new Mamifero(nombre, edad, "selva", genero, true, 4);
        leones++;
        return leon;
    }
}
