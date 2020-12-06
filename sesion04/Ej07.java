package sesion04;

import java.util.Scanner;

public class Ej07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce la nota numérica (entre 0 y 10) ");
        int num = sc.nextInt();

        if (num >=0 && num <3) {
            System.out.println("MD");
        } if (3<= num && num <5) {
            System.out.println("INS");
        } if (5<= num && num <6) {
            System.out.println("SUF");
        } if (6<= num && num <7) {
            System.out.println("B");
        } if (7<= num && num <9) {
            System.out.println("N");
        } else {
            System.out.println("SB");
        }

    }

}
