import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("introduce el primer numero: ");
        int num1 = sc.nextInt();
            System.out.println("introduce otro numero: ");
        int num2 = sc.nextInt();

        int suma = num1 + num2;
        System.out.println("la suma de " +num1+ " y "  +num2+ " es: " + suma);

        int resta = num1 - num2;
        System.out.println("la resta de " +num1+ " y " +num2+ " es: " +resta);

        int multiplicacion = num1 * num2;
        System.out.println(multiplicacion);
        int division = num1 / num2;
        System.out.println(division);
        int resto = num1 % num2;
        System.out.println(resto);


    }

}

