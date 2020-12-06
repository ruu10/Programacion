package sesion07;

import java.util.Scanner;

public class Ej02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        int num;
        do {
            System.out.println("Introduce un número (0 para finalizar)");
            num = sc.nextInt();
            contador++;
        }while (num != 0);
        System.out.println("Has introducido " + (contador - 1) + " números ");
    }
}
