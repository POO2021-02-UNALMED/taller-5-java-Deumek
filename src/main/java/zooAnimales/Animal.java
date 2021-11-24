package zooAnimales;
import gestion.*;

public class Animal {
    private static int totalAnimales = 0;
    private String nombre;
    private int edad;
    private String habitat;
    private String genero;
    private Zona zona;

    public Animal() {
        
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getHabitat() {
        return habitat;
    }

    public String getGenero() {
        return genero;
    }

    public static int getTotalAnimales() {
        return totalAnimales;
    }

    public void setZona(Zona zona) {
        this.zona = zona;
    }

    public Animal(String nombre, int edad, String habitat, String genero) {
        totalAnimales++;
        this.nombre = nombre;
        this.edad = edad;
        this.habitat = habitat;
        this.genero = genero;
    }

    public String movimiento() {
        return "desplazarse";
    }

    public static String totalPorTipo() {
        int totalMamiferos = Mamifero.mamiferos.size();
        int totalAves = Ave.aves.size();
        int totalReptiles = Reptil.reptiles.size();
        int totalPeces = Pez.peces.size();
        return "Mamiferos: " + totalMamiferos + "\nAves:" + totalAves + "\nReptiles:" + totalReptiles + "\nPeces:" + totalPeces;
    }

    public String toString() {
        return "Mi nombre es " + nombre + ", tengo una edad de " + edad + ", habito en " + habitat + " y mi genero es " + genero + ", la zona en la que me ubico es " + zona.getNombre() + ", en el " + zona.getZoo().getNombre();
    }
}