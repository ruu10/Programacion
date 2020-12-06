package sesion05;

import java.util.Scanner;

public class Ej02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Que lenguaje de programación estudias? ");
        System.out.println("1. Java");
        System.out.println("2. Kotlin");
        System.out.println("3. Scala");
        System.out.println("4. Python");
        int respuesta = sc.nextInt();

        switch (respuesta) {
            case 1:
                System.out.println("Sí");
                break;
            case 2:
                System.out.println("No");
                break;
            case 3:
                System.out.println("No");
                break;
            case 4:
                System.out.println("No");
                break;
        }
    }
}
