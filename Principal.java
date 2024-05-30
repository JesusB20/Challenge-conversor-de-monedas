import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultaCambio conversion = new ConsultaCambio();

        int salir = 1;

        while (salir != 9) {
            System.out.println("""
                    <<<< Elija la opcion de cambio de la siguiente lista >>>>
                    1) USD a MXN
                    2) MXN a USD
                    3) EUR a USD
                    4) USD a EUR
                    5) EUR a MXN
                    6) MXN a EUR
                    7) CAD a MXN
                    8) MXN a CAD
                    9) Salir
                    """);
            int cambio = Integer.parseInt(lectura.next());

            if (cambio != 9) {
                System.out.println("Escriba la cantidad a convertir");
                var cantidad = Float.parseFloat(lectura.next());
                String par = Eleccion.getString(cambio);
                System.out.println(par);
                Moneda moneda = conversion.realizaCambio(cantidad, par);
                System.out.println("El resultado de la conversion es: " + moneda + "\n");
            } else {
                salir = 9;
                System.out.println("Hasta la proxima");
            }
        }
    }
}