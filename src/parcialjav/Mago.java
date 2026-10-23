
package parcialjav;


public class Mago extends Aventurero {
    private final int mana;

    public Mago(String codigo, String nombre, Rango rango, int mana) {
        super(codigo, nombre, rango);
        if (mana <= 0) {
            throw new IllegalArgumentException("El maná debe ser mayor que cero");
        }
        this.mana = mana;
    }

    public int getMana() { return mana; }

    @Override
    public String atacar() {
        return getNombre() + " lanza un hechizo";
    }

    @Override
    public int calcularPoder() {
        return mana + 10;
    }
}
