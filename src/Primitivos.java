public class Primitivos {
    public static void main(String[] args) {
        
        byte numeroByte = 124;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("El tipo byte corresponde en bytes a: " +Byte.BYTES);
        System.out.println("El tipo byte corresponde en bites a: " +Byte.SIZE);
        System.out.println("Valor máximo de un bYte: " +Byte.MAX_VALUE);
        System.out.println("Valor mínimo de un byte: " +Byte.MIN_VALUE);

        short numeroShort = 3000;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("El tipo short corresponde en bytes a: " +Short.BYTES);
        System.out.println("El tipo short corresponde en bites a: " +Short.SIZE);
        System.out.println("Valor máximo de un short: " +Short.MAX_VALUE);
        System.out.println("Valor mínimo de un short: " +Short.MIN_VALUE);

        int numeroInt = 32768;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("El tipo int corresponde en bytes a: " +Integer.BYTES);
        System.out.println("El tipo int corresponde en bites a: " +Integer.SIZE);
        System.out.println("Valor máximo de un int: " +Integer.MAX_VALUE);
        System.out.println("Valor mínimo de un int: " +Integer.MIN_VALUE);

        long numeroLong = 2147483648L;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("El tipo int corresponde en bytes a: " +Long.BYTES);
        System.out.println("El tipo int corresponde en bites a: " +Long.SIZE);
        System.out.println("Valor máximo de un int: " +Long.MAX_VALUE);
        System.out.println("Valor mínimo de un int: " +Long.MIN_VALUE);
    }
}
