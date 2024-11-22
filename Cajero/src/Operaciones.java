import java.util.Scanner;

public class Operaciones {
    private double valorPago;
    private double valorPagar;


    public Operaciones (double valorPagar, double valorPago){
        this.valorPagar = valorPagar;
        this.valorPago = valorPago;
        double resta = valorPagar - valorPago;

        if (resta < 0){
            double cambio = Math.abs(resta);
            System.out.println("Devueltas " + cambio);
            CalcularCambio calcularCambio = new CalcularCambio(cambio);


        } else if (resta == 0) {
            System.out.println("Gracias por su pago");
        } else if (resta > 0) {
            System.out.println("Debes ingresar " + (resta) + "mas");

        }




    }
}
