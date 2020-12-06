package sesion07;

import java.util.Scanner;

public class Ej07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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
            }else if (numIntroducido == 0) {
                System.out.println("Te has rendido, el número era: " + numAleatorio);
            }else if (numIntroducido < numAleatorio) {
                System.out.println("El número a encontrar es mayor");
                encontrado = true;
            }else {
                System.out.println("El número a encontrar es menor");
            }

        }
    }
}
