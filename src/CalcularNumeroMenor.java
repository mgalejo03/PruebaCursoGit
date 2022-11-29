import java.util.Scanner;

public class CalcularNumeroMenor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


            int menor = Integer.MAX_VALUE;
            int num;
            for (int i = 0; i < 10; i++){
                System.out.println("Ingresa el numero " + (i + 1) + " :");
                num = sc.nextInt();
                menor = (num < menor) ? num : menor;
            }
        System.out.println("El numero menor es = " + menor);
            if (menor < 10){
                System.out.println("El numero menor de la cadena es menor que 10");
            }else{
                System.out.println("El numero menor de la cadena es mayor o igual a 10");
            }
    }
}
