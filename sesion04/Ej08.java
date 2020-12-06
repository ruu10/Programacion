package sesion04;

import java.util.Scanner;

public class Ej08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Edad: ");
        int edad = sc.nextInt();
        if (edad < 18) {
            System.out.println("Menor de edad.");
        } else if(edad < 65) {
            System.out.println("Work in progress");
        } else if (edad < 67) {
            System.out.println("jubilable");
        } else {
            System.out.println("jubilado");
        }
        System.out.println("Ya esta.");
    }
}
