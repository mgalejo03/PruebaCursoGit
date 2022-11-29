import java.util.Scanner;

public class MayorNumMenor {
    public static void main(String[] args) {
        int may = 0;
        int men = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un numero: ");
        int numero1 = sc.nextInt();
        System.out.println("Ingresa otro numero");
        int numero2 = sc.nextInt();

        may = (numero1 > numero2) ? numero1 : numero2;
        men = (numero1 < numero2) ? numero1 : numero2;
        System.out.println("El número mayor es: " + may + " y el número menor es: "+ men);

    }
}
