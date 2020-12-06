package sesion04;

import java.util.Scanner;

public class Ej01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("El número introducido " + (num) + " es par ");
        } else {
            System.out.println("El número introducido " + (num)+ " es impar");
        }
    }
}
