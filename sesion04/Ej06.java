package sesion04;

import java.util.Scanner;

public class Ej06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el número de tazas: ");
        int num1 = sc.nextInt();
        System.out.println("¿Es fin de semana? ");
        boolean x = sc.nextBoolean();
        if (num1 >= 15 && num1 <= 25 && x==true) {
            System.out.println(x);
        }else if (num1 >= 10 && num1 <= 20 && x==false) {
            System.out.println(x);
            }
        }
    }

