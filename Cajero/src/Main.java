import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double valorApagar = 0;
        double valorIngresado = 0;
        boolean selec = true;

        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese el valor a pagar");
            valorApagar = sc.nextDouble();
            System.out.println("Ingrese el dinero");
            valorIngresado = sc.nextDouble();
            Operaciones operaciones = new Operaciones(valorApagar, valorIngresado);
            int opc = 0;
            System.out.println("Seleccione una opcion\n" + "1. Parar\n" + "2. Seguir");
            opc = sc.nextByte();
            switch (opc){
                case 1:
                    System.out.println("bye");
                    selec = false;
                    break;
                case 2:
                    System.out.println("Siguiendo...");
                    break;


            }
        }while (selec);

    }
}