package Practicas;

import java.util.Scanner;

public class Practica4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el ejercicio a resolver: ");
        System.out.println("1. For ");
        System.out.println("2. While ");
        boolean esIncorrecto = false;
        int num = sc.nextInt();
        while (num != 1 && num != 2) {
            System.out.println("Opción incorrecta. ");
            System.out.println("1. For ");
            System.out.println("2. While ");
            num = sc.nextInt();
        }

        switch (num) {
            case 1:
                System.out.println("a: ");
                int base = sc.nextInt();
                System.out.println("b: ");
                int altura = sc.nextInt();
                System.out.println("Carácter: ");
                char sim = sc.next().charAt(0);

                for (int i = 0; i < base; i++) {
                    for (int j = 1; j <= altura; j++) {
                        System.out.print("* ");
                    }
                    System.out.println("");
                }
                    break;
            case 2:
                System.out.println("Introduce un número entre 1 y 100: ");
                int numIntroducido = sc.nextInt();
                int numAleatorio = (int) (Math.random() * 100 + 1);
                boolean encontrado = true;
                boolean seguir = false;

                while (numIntroducido >=1 && numAleatorio <=100) {
                    System.out.println("Introduce un número");
                    numIntroducido = sc.nextInt();
                    if (numIntroducido == numAleatorio) {
                        System.out.println("Felicidades, has encontrado el número");
                        break;
                    } else if (numIntroducido == 0) {
                        System.out.println("Te has rendido, el número era: " + numAleatorio);
                    } else if (numIntroducido < numAleatorio) {
                        System.out.println("El número a encontrar es mayor");
                        encontrado = true;
                    } else {
                        System.out.println("El número a encontrar es menor");
                    }
                }
        }
    }
}
