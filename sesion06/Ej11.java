package sesion06;

import java.util.Scanner;

public class Ej11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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
            }
}

