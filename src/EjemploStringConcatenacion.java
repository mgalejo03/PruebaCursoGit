public class EjemploStringConcatenacion {
    public static void main(String[] args) {
        String curso = "Programación Java";
        String profesor = "Maria AH";

        String detalle = curso +  " con la instructora " + profesor;
        System.out.println("detalle = " + detalle);

        int numero1 = 20;
        int numero2 = 6;

        System.out.println(detalle + (numero1 + numero2));

        System.out.println(numero1 +  numero2 + detalle);

        String detalle2 = curso.concat(" con ").concat(profesor);
        System.out.println("detalle2 = " + detalle2);


    }
}
