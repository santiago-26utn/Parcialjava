
package parcialjav;

public class Arquero extends Aventurero implements Entrenable {
    private final int precision;

    public Arquero(String codigo, String nombre, Rango rango, int precision) {
        super(codigo, nombre, rango);
        if (precision <= 0) {
            throw new IllegalArgumentException("La precisión debe ser mayor que cero");
        }
        this.precision = precision;
    }

    public int getPrecision() { return precision; }

    @Override
    public String atacar() {
        return getNombre() + " dispara una flecha";
    }

    @Override
    public int calcularPoder() {
        return precision * 3;
    }

    @Override
    public String entrenar() {
        return getNombre() + " practica puntería en el campo de tiro";
    }
}

