package zooAnimales;
import java.util.ArrayList;

public class Ave extends Animal {
    public static ArrayList<Ave> aves = new ArrayList<Ave>();
    public static int halcones;
    public static int aguilas;
    private String colorPlumas;

    public Ave() {
        super(null, 0, null, null);
        aves.add(this);
    }

    public String getColorPlumas() {
        return colorPlumas;
    }

    public void setColorPlumas(String color) {
        colorPlumas = color;
    }

    public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas) {
        super(nombre, edad, habitat, genero);
        this.colorPlumas = colorPlumas;
        aves.add(this);
    }

    public int cantidadAves() {
        return aves.size();
    }

    public String movimiento() {
        return "volar";
    }

    public static Ave crearHalcon(String nombre, int edad, String genero) {
        Ave halcon = new Ave(nombre, edad, "montanas", genero, "cafe glorioso");
        halcones++;
        return halcon;
    }

    public static Ave crearAguila(String nombre, int edad, String genero) {
        Ave aguila = new Ave(nombre, edad, "montanas", genero, "blanco y amarillo");
        aguilas++;
        return aguila;
    }
}
