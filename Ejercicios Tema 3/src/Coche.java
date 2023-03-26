public class Coche {
    private int numPuertas;

    public Coche(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public void añadirPuerta() {
        this.numPuertas++;
    }

    public int getNumPuertas() {
        return numPuertas;
    }
}


