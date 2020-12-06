package sesion02;

import java.util.Scanner;

public class CalculaPerimetroCuadrado {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el lado del cuadrado: ");
        int lado = sc.nextInt(); //introduzco el numero por teclado
        int perimetro = lado * 4; // calculo el perimetro y los guardo
        System.out.println("El perimetro es: " + perimetro);


        }


    }

