
package parcialjava;


 
public class AventureroDuplicado extends Exception {

    public AventureroDuplicado(String codigo, String nombre) {
        super("Ya existe un aventurero con código '" + codigo
                + "' y nombre '" + nombre + "'");
    }
}
