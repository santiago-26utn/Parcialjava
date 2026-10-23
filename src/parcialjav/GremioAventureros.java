
package parcialjav;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;


public class GremioAventureros {
    private final String nombre;
    private final Set<Aventurero> aventureros;

    public GremioAventureros(String nombre) {
        this.nombre = nombre;
        this.aventureros = new LinkedHashSet<>();
    }

    public String getNombre() { return nombre; }

    
    public void agregarAventurero(Aventurero aventurero) throws AventureroDuplicado {
        if (!aventureros.add(aventurero)) {
            throw new AventureroDuplicado(aventurero.getCodigo(), aventurero.getNombre());
        }
    }

    
    public List<Aventurero> obtenerAventureros() {
        return new ArrayList<>(aventureros);
    }

    
    public List<Aventurero> filtrarPorRango(Rango rango) {
        List<Aventurero> resultado = new ArrayList<>();
        for (Aventurero a : aventureros) {
            if (a.getRango() == rango) {
                resultado.add(a);
            }
        }
        return resultado;
    }

    
    public List<Aventurero> obtenerAventurerosPoderosos(int poderMinimo) {
        List<Aventurero> resultado = new ArrayList<>();
        for (Aventurero a : aventureros) {
            if (a.calcularPoder() >= poderMinimo) {
                resultado.add(a);
            }
        }
        return resultado;
    }
}
