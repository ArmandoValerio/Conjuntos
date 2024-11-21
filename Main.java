public class Main {
    public static void main(String[] args) {
        LoteriaMexicana loteria = new LoteriaMexicana();
        loteria.barajarCartas();
        
        System.out.println("Sacando una carta de manera aleatoria:");
        CartaLoteria carta = loteria.sacarCartaAleatoria();
        System.out.println(carta);

        System.out.println("Cartas restantes:");
        System.out.println(loteria);
    }
}

