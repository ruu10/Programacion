package sesion06;

import java.util.Scanner;

public class Ej03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Primer numero: ");
        int a = sc.nextInt();
        System.out.println("Segundo numero: ");
        int b = sc.nextInt();

        int suma = 0;
        for (int i = a; i <= b; i++) {
            suma = suma + i;

        }
        System.out.println(suma);
    }
}
