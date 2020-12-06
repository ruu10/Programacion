package Practicas;

import java.util.Scanner;

public class Practica1 {
    public static void main(String[] args) {

          Scanner sc = new Scanner(System.in);
          System.out.println("Momento inicial");
          System.out.println("=============");
          System.out.println("Introduce la hora:");
        int nu1 = sc.nextInt();
          System.out.println("Introduce los minutos:");
        int nu2 = sc.nextInt();
          System.out.println("Introduce los segundos:");
        int nu3 = sc.nextInt();

        int horasSegundos = 3600;
        int minutosSegundos = 60;


        int horasSegundosTotal = nu1 * horasSegundos;
        int minutosSegundosTotal = nu2 * minutosSegundos;
        int Segundos = nu3;


          System.out.println("Momento final:");
          System.out.println("=============");
          System.out.println("Introduce la hora");
        int nu4 = sc.nextInt();
          System.out.println("Introduce los minutos");
        int nu5 = sc.nextInt();
          System.out.println("Introduce los segundos");
        int nu6 = sc.nextInt();

        int horasSegundosFinal = nu4 * horasSegundos;
        int minutosSegundosFinal = nu5 * minutosSegundos;


        System.out.println("Momento inicial: "+(horasSegundosTotal/horasSegundos)+":"+(minutosSegundosTotal/minutosSegundos)+":"+nu3+"        Momento final: "+(horasSegundosFinal/horasSegundos)+":"+(minutosSegundosFinal/minutosSegundos)+":"+nu6);

        int totalHorasInicial = (horasSegundosTotal+minutosSegundosTotal+nu3);
        int totalhorasFinal = (horasSegundosFinal+minutosSegundosFinal+nu6);
        int totalHoras = (totalhorasFinal-totalHorasInicial);

        int hora = (totalHoras/horasSegundos);
        int minutos = (totalHoras-(horasSegundos*hora))/minutosSegundos;
        int segundos = (totalHoras-((hora*horasSegundos)+(minutos*minutosSegundos)));


        System.out.println("La diferencia entre ambos momentos es: " +hora+":"+minutos+":"+segundos);



    }
}
