package gestion;
import java.util.ArrayList;
import zooAnimales.*;

public class Zona {
    private String nombre;
    private Zoologico zoo;
    private ArrayList<Animal> animales = new ArrayList<Animal>();

    public Zona() {
        
    }

    public String getNombre() {
        return nombre;
    }

    public Zoologico getZoo() {
        return zoo;
    }

    public void setZoo(Zoologico zoo) {
        this.zoo = zoo;
    }

    public Zona(String nombre, Zoologico zoo) {
        this.nombre = nombre;
        this.zoo = zoo;
        animales = new ArrayList<Animal>();
    }

    public void agregarAnimales(Animal animal) {
        animales.add(animal);
        animal.setZona(this);
    }

    public int cantidadAnimales() {
        return animales.size();
    }
}
