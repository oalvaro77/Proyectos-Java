public class CalcularCambio {
    private double cambio;
    private int[] billetes = {100000, 50000, 20000, 10000, 5000, 2000, 1000};
    private int[] monedas = {500, 200, 100, 50};

    public CalcularCambio(double cambio){
        this.cambio = cambio;
        int restante = (int)Math.round(cambio);

        System.out.println("Billetes");
        for (int billete : billetes){
            int cantidad = restante / (billete);
            if (cantidad > 0){
                System.out.println(cantidad + " billetes de $ " + billete);
                restante%= billete;
            }
        }

        System.out.println("Monedas");
        for (int moneda : monedas){
            int cantidad = restante / moneda;
            if (cantidad > 0){
                System.out.println(cantidad + " monedas de $ " + moneda);
                restante %= moneda;
            }
        }
    }
}
