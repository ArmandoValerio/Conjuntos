public class CartaLoteria extends Carta {
    private int numero;

    public CartaLoteria(String nombre, int numero) {
        super(nombre);
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return "CartaLoteria{" +
                "nombre='" + getNombre() + '\'' +
                ", numero=" + numero +
                '}';
    }
}
