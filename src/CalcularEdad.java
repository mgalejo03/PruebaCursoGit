import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CalcularEdad {
    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat formato = new SimpleDateFormat("yyyy");
        System.out.println("Ingresa tu año de nacimiento: ");
        String anioNacimiento = sc.next();
        System.out.println("Año de nacimiento: " + anioNacimiento);

        DateFormat dateF = new SimpleDateFormat("yyy-MM-dd");
        Date fNacimiento  = dateF.parse(anioNacimiento);
        Date actual = new Date();
        dateF = new SimpleDateFormat("yyyyMMdd");

        int fechaActual = Integer.parseInt(dateF.format(fNacimiento));
        int fechaNac = Integer.parseInt(dateF.format(actual));

        int edad = (fechaNac - fechaActual) / 10000;
        System.out.println("Tu edad es: " + edad);
    }
}
