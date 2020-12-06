package sesion06;

import java.util.Scanner;

public class Ej04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Primer numero: ");
        int a = sc.nextInt();
        System.out.println("Segundo numero: ");
        int b = sc.nextInt();

        int menor = a;
        int mayor = b;
        if (a > b) {
            menor = b;
            mayor = a;
        }

        int suma = 0;
        for (int i = menor; i <= mayor; i++) {
            suma = suma + i;

        }
        System.out.println(suma);
    }
}
