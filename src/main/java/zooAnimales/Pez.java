package zooAnimales;
import java.util.ArrayList;

public class Pez extends Animal {
    public static ArrayList<Pez> peces = new ArrayList<Pez>();
    public static int salmones = 0;
    public static int bacalaos = 0;
    private String colorEscamas;
    private int cantidadAletas;

    public Pez() {
        super(null, 0, null, null);
    }

    public String getColorEscamas() {
        return colorEscamas;
    }

    public void setColorEscamas(String color) {
        colorEscamas = color;
    }

    public int getCantidadAletas() {
        return cantidadAletas;
    }

    public void setCantidadAletas(int cn) {
        cantidadAletas = cn;
    }

    public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas) {
        super(nombre, edad, habitat, genero);
        this.colorEscamas = colorEscamas;
        this.cantidadAletas = cantidadAletas;
        peces.add(this);
    }

    public int cantidadPeses() {
        return peces.size();
    }

    public String movimiento() {
        return "nadar";
    }

    public static Pez crearSalmon(String nombre, int edad, String genero) {
        Pez salmon = new Pez(nombre, edad, "oceano", genero, "rojo", 6);
        salmones++;
        return salmon;
    }

    public static Pez crearBacalao(String nombre, int edad, String genero) {
        Pez bacalao = new Pez(nombre, edad, "oceano", genero, "gris", 6);
        bacalaos++;
        return bacalao;
    }
}
