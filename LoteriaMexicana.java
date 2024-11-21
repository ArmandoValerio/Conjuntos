import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class LoteriaMexicana {
    private List<CartaLoteria> cartas;

    public LoteriaMexicana() {
        cartas = new ArrayList<>();
        inicializarCartas();
    }

    private void inicializarCartas() {
        // Añadimos las cartas de la lotería mexicana
        cartas.add(new CartaLoteria("El Gallo", 1));
        cartas.add(new CartaLoteria("El Diablito", 2));
        cartas.add(new CartaLoteria("La Dama", 3));
        cartas.add(new CartaLoteria("El Catrin", 4));
        cartas.add(new CartaLoteria("El Paraguas", 5));
        cartas.add(new CartaLoteria("La Sirena", 6));
        // Continúa añadiendo todas las cartas de la lotería mexicana...
    }

    public void barajarCartas() {
        Collections.shuffle(cartas);
    }

    public CartaLoteria sacarCartaAleatoria() {
        if (cartas.isEmpty()) {
            return null; // No hay más cartas para sacar
        }
        Random random = new Random();
        return sacarCartaAleatoriaRecursivo(random.nextInt(cartas.size()));
    }

    private CartaLoteria sacarCartaAleatoriaRecursivo(int index) {
        if (index == 0) {
            return cartas.remove(index);
        } else {
            CartaLoteria carta = cartas.get(index);
            cartas.set(index, cartas.get(index - 1));
            cartas.set(index - 1, carta);
            return sacarCartaAleatoriaRecursivo(index - 1);
        }
    }

    @Override
    public String toString() {
        return "LoteriaMexicana{" +
                "cartas=" + cartas +
                '}';
    }
}
