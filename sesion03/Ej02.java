package sesion03;

import java.util.Scanner;

public class Ej02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero: ");
        int num = sc.nextInt();
         boolean mayorQue0YMenorQue10 = num < 10 && num > 0;
        System.out.println(mayorQue0YMenorQue10);

    }
}
