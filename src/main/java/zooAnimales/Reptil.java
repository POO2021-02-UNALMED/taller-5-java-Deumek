package zooAnimales;
import java.util.ArrayList;

public class Reptil extends Animal {
    public static ArrayList<Reptil> reptiles = new ArrayList<Reptil>();
    public static int iguanas;
    public static int serpientes;
    private String colorEscamas;
    private int largoCola;

    public Reptil() {
        super(null, 0, null, null);
        reptiles.add(this);
    }

    public String getColorEscamas() {
        return colorEscamas;
    }

    public void setColorEscamas(String color) {
        colorEscamas = color;
    } 

    public int getLargoCola() {
        return largoCola;
    }

    public void setLargoCola(int largo) {
        largoCola = largo;
    } 

    public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola) {
        super(nombre, edad, habitat, genero);
        this.colorEscamas = colorEscamas;
        this.largoCola = largoCola;
        reptiles.add(this);
    }

    public int cantidadReptiles() {
        return reptiles.size();
    }

    public String movimiento() {
        return "reptar";
    }

    public static Reptil crearIguana(String nombre, int edad, String genero) {
        Reptil iguana = new Reptil(nombre, edad, "humedal", genero, "verde", 3);
        iguanas++;
        return iguana;
    }

    public static Reptil crearSerpiente(String nombre, int edad, String genero) {
        Reptil serpiente = new Reptil(nombre, edad, "jungla", genero, "blanco", 1);
        serpientes++;
        return serpiente;
    }
}
