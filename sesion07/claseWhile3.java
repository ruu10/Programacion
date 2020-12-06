package sesion07;

import java.util.Scanner;

public class claseWhile3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor;
        do {
            System.out.println("Introduce un número: ");
            valor = sc.nextInt();
            System.out.println("Has introducido: " + valor);
        }while (valor != 0);

        System.out.println("Despues del bucle: " + valor);
    }
}
