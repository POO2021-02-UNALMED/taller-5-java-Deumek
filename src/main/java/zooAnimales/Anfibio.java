package zooAnimales;
import java.util.ArrayList;

public class Anfibio extends Animal {
    public static ArrayList<Anfibio> anfibios = new ArrayList<Anfibio>();
    public static int ranas;
    public static int salamandras;
    private String colorPiel;
    private boolean venenoso;

    public Anfibio() {
        super(null, 0, null, null);
        anfibios.add(this);
    }

    public String getColorPiel() {
        return colorPiel;
    }

    public void setColorPiel(String color) {
        colorPiel = color;
    }

    public boolean isVenenoso() {
        return venenoso;
    }

    public void setVenenoso(boolean venenoso) {
        this.venenoso = venenoso;
    }

    public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso) {
        super(nombre, edad, habitat, genero);
        this.colorPiel = colorPiel;
        this.venenoso = venenoso;
        anfibios.add(this);
    }

    public int cantidadAnfibios() {
        return anfibios.size();
    }

    public String movimiento() {
        return "saltar";
    }

    public static Anfibio crearRana(String nombre, int edad, String genero) {
        Anfibio rana = new Anfibio(nombre, edad, "selva", genero, "rojo", true);
        ranas++;
        return rana;
    }

    public static Anfibio crearSalamandra(String nombre, int edad, String genero) {
        Anfibio salamandra = new Anfibio(nombre, edad, "venenoso", genero, "negro y amarillo", false);
        salamandras++;
        return salamandra;
    }
}
