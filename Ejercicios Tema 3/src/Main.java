public class Main {
    public static void main(String[] args) {


        // primera parte
        int resultado = suma(2, 3, 5);
        System.out.println("El resultado de la suma es: " + resultado); //primera parte

        //segunda parte
        Coche miCoche = new Coche(4);
        miCoche.añadirPuerta();
        System.out.println("Mi coche tiene " + miCoche.getNumPuertas() + " puertas");

    }

    //primera parte
    public static int suma(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
}




