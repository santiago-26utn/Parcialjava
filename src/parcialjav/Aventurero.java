
package parcialjav;

import java.util.Objects;


public abstract class Aventurero {
    private final String codigo;
    private final String nombre;
    private final Rango rango;

    public Aventurero(String codigo, String nombre, Rango rango) {
        if (codigo == null || codigo.isBlank()) {
            throw new IllegalArgumentException("El código no puede ser nulo ni estar en blanco");
        }
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("El nombre no puede ser nulo ni estar en blanco");
        }
        if (rango == null) {
            throw new IllegalArgumentException("El rango es obligatorio");
        }
        this.codigo = codigo;
        this.nombre = nombre;
        this.rango = rango;
    }

    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public Rango getRango() { return rango; }

    public abstract String atacar();
    public abstract int calcularPoder();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Aventurero)) return false;
        Aventurero otro = (Aventurero) o;
        return codigo.equals(otro.codigo) && nombre.equals(otro.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, nombre);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " [" + codigo + "] " + nombre + " - " + rango;
    }
}

