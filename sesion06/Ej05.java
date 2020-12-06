package sesion06;

import java.util.Scanner;

public class Ej05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int num = sc.nextInt();

        for (int j = 1; j <= 6; j++){
            System.out.print("Tabla del " + j + ": ");
            for (int i = 1; i <= 10; i++) {
                System.out.print((j * i) + "\t");

            }
            System.out.println();
        }
    }

}
