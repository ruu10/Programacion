package sesion04;

import java.util.Scanner;

public class Ej02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sueldo anual");
        int sueldo = sc.nextInt();
        if (sueldo < 9000) {
            System.out.println("No pagar impuestos ");
        } else {
            System.out.println("Debes pagar impuestos ");


        }

    }
}
