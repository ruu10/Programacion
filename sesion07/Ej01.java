package sesion07;

import java.util.Scanner;

public class Ej01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número entre 1 y 100");
        int num = sc.nextInt();
        while (num < 1 || num > 100) {
            System.out.println("Número fuera de rango. \nIntroduzca un número entre 1 y 100 ");
            num = sc.nextInt();
        }
        System.out.println("Has introducido: " + num);
    }
}
