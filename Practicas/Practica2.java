package Practicas;

import java.util.Scanner;

public class Practica2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer numero: ");
        int num1 = sc.nextInt();
        if (num1 < 0) {
            System.out.println("es negativo. ");
            System. exit(0);
        } else {
            System.out.println("Introduce el segundo numero: ");
        }
        int num2 = sc.nextInt();
        if (num2 < 0) {
            System.out.println("Es negativo. ");
            System.exit(0);
        } else {
            System.out.println("introduce la operación: ");
        }
        char c = sc.next().charAt(0);
        switch (c) {
            case '+':
                System.out.println("El resultado es: " + (num1 + num2));
                break;
            case '-':
                System.out.println("El resultado es: " + (num1 - num2));
                break;
            case '*':
                System.out.println("El resultado es: " + (num1 * num2));
                break;
            case '/':
                System.out.println("El resultado es: " + (num1 / num2));
                break;
        }
    }
}