
import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemasNumericosEntradaScanner {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero entero: ");

        int numeroDecimal = 0;
        try {
            numeroDecimal = scanner.nextInt(); //Integer.parseInt(numeroStr);
        }catch (InputMismatchException e){
            System.out.println("Error debe ingresar un numero entero!");
            main(args);
            System.exit(0);
        }
        System.out.println("numeroDecimal = " + numeroDecimal);
        
        int numeroBinario = 0b11110;
        System.out.println("numeroBinario = " + numeroBinario);

        int numeroOctal = 036;
        System.out.println("numeroOctal = " + numeroOctal);

        int numeroHex = 0x1e;
        System.out.println("numeroHex =3 " + numeroHex);

        String mensaje = "\nNumero binario de " + numeroDecimal + " es = " + Integer.toBinaryString(numeroDecimal);
        mensaje += "\nNumero octal de " + numeroDecimal + " es = " + Integer.toOctalString(numeroDecimal);
        mensaje += "\nNumero hexadecimal de " + numeroDecimal + " es = " + Integer.toHexString(numeroDecimal);

        System.out.println(mensaje);


    }
}
