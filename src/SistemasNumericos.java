import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {

        String numeroStr = JOptionPane.showInputDialog(null, "Ingrese un numero entero: ");
        int numeroDecimal = 0;
        try {
            numeroDecimal = Integer.parseInt(numeroStr);
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error debe ingresar un numero entero");
            main(args);
            System.exit(0);
        }
        System.out.println("numeroDecimal = " + numeroDecimal);
        System.out.println("numero binario de " + numeroDecimal + " es = " + Integer.toBinaryString(numeroDecimal));
        
        int numeroBinario = 0b11110;
        System.out.println("numeroBinario = " + numeroBinario);

        System.out.println("numero octal de " + numeroDecimal + " es = " + Integer.toOctalString(numeroDecimal));

        int numeroOctal = 036;
        System.out.println("numeroOctal = " + numeroOctal);

        System.out.println("numero hexadecimal de " + numeroDecimal + " es = " + Integer.toHexString(numeroDecimal));
        int numeroHex = 0x1e;
        System.out.println("numeroHex = " + numeroHex);

        String mensaje = "\nNumero binario de " + numeroDecimal + " es = " + Integer.toBinaryString(numeroDecimal);
        mensaje += "\nNumero octal de " + numeroDecimal + " es = " + Integer.toOctalString(numeroDecimal);
        mensaje += "\nNumero hexadecimal de " + numeroDecimal + " es = " + Integer.toHexString(numeroDecimal);

        JOptionPane.showMessageDialog(null, mensaje);


    }
}
