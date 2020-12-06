package sesion02;

import java.util.Scanner;

public class SumaProducto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el pimer numero; ");
        int num1 = sc.nextInt();
        System.out.println("Introduce el segundo numero; ");
        int num2 = sc.nextInt();
        System.out.println("Introduce el tercer numero; ");
        int num3 = sc.nextInt();
        System.out.println("Introduce el cuarto numero; ");
        int num4 = sc.nextInt();
        //Calculo suma y producto
        int suma = num1 + num2;
        int producto = num3 * num4;

        //muestro el resultado
        System.out.println("La suma de " +num1+ " y " +num2+ " es: " + suma);
        System.out.println("El producto de " +num3+ " y " +num4+ " es: " + producto);

    }
}
