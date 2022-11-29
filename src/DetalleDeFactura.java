import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el nombre de la factura: ");
        String nombreF = scanner.nextLine();
        System.out.println("Ingresa el precio del producto 1: ");
        double precio1 = scanner.nextDouble();
        System.out.println("Ingresa el precio del producto 2: ");
        double precio2 = scanner.nextDouble();

        double suma = precio1 + precio2;
        double porciento = (19*100)/suma;
        double resFinal = suma + porciento;
        System.out.println("La factura de " + nombreF + " tiene un total de " + suma
                + " con un impuesto de " + porciento + " y el monto final después del impuesto es "+ resFinal);
    }
}
