package sesion04;

import java.util.Scanner;

public class Ej05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer lado: ");
        int a = sc.nextInt();
        System.out.println("Introduce el segundo lado: ");
        int b = sc.nextInt();
        System.out.println("introduce el tercer lado: ");
        int c = sc.nextInt();

        if ((a+b)>c || (a+c)>b || (b+c)>a) {
            System.out.println("Sí");
            } else {
            System.out.println("No");
        }
    }
}