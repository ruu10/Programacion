package sesion05;

import java.util.Scanner;

public class Ej05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Número de dirección: ");
        int dirección = sc.nextInt();
        int arriba = 1;
        int abajo = 2;
        int izquierda = 3;
        int derecha = 4;
        int noMover = 0;

        switch (dirección) {
            case 1:
                System.out.println("subir");
                break;
            case 2:
                System.out.println("bajar");
                break;
            case 3:
                System.out.println("mover a la izquierda");
                break;
            case 4:
                System.out.println("mover a la derecha");
                break;
            case 0:
                System.out.println("no mover");
                break;
            default:
                System.out.println("¡error!");
        }
    }
}
