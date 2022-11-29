import java.util.Scanner;

public class EjemploStringValidar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el nombre de un familiar: ");
        String familiar1 = scanner.nextLine();
        String f1 = familiar1.toUpperCase().charAt(1)+ "." + familiar1.substring(familiar1.length()-2);
        System.out.println("Ingresa el nombre de un segundo familiar: ");
        String familiar2 = scanner.nextLine();
        String f2 = familiar2.toUpperCase().charAt(1)+ "." + familiar2.substring(familiar2.length()-2);
        System.out.println("Ingresa el nombre de un tercer familiar: ");
        String familiar3 = scanner.nextLine();
        String f3 = familiar3.toUpperCase().charAt(1)+ "." + familiar3.substring(familiar3.length()-2);

        System.out.println(f1+"_" +f2 + "_"+f3);
    }
}
