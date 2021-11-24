package gestion;
import java.util.ArrayList;

public class Zoologico {
    private String nombre;
    private String ubicacion;
    private ArrayList<Zona> zonas = new ArrayList<Zona>();

    public Zoologico() {

    }

    public ArrayList<Zona> getZona() {
        return zonas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbacion(String ubicacion) {
        this.ubicacion = ubicacion;
    } 

    public Zoologico(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.zonas = new ArrayList<Zona>();
    }

    public void agregarZonas(Zona zona) {
        zonas.add(zona);
        zona.setZoo(this);
    }

    public int cantidadTotalAnimales() {
        int numAnimalesZonas = 0;
        for(int i = 0; i < zonas.size(); i++) {
            numAnimalesZonas += zonas.get(i).cantidadAnimales();
        }
        return numAnimalesZonas;
    }
}