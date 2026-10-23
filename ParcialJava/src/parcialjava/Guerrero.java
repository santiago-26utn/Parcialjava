
package parcialjava;


public class Guerrero extends Aventurero implements Entrenable {
    private final int fuerza;

    public Guerrero(String codigo, String nombre, Rango rango, int fuerza) {
        super(codigo, nombre, rango);
        if (fuerza <= 0) {
            throw new IllegalArgumentException("La fuerza debe ser mayor que cero");
        }
        this.fuerza = fuerza;
    }

    public int getFuerza() { return fuerza; }

    @Override
    public String atacar() {
        return getNombre() + " ataca con su espada";
    }

    @Override
    public int calcularPoder() {
        return fuerza * 2;
    }

    @Override
    public String entrenar() {
        return getNombre() + " entrena con pesas y combate cuerpo a cuerpo";
    }
}
