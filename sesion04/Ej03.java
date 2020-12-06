package sesion04;

import java.util.Scanner;

public class Ej03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número del 1 al 7: ");
        int día = sc.nextInt();
        if (día == 1){
            System.out.println("Lunes");
        } else if (día == 2){
            System.out.println("Martes");
        } else if (día == 3){
            System.out.println("Miercoles");
        } else if (día == 4){
            System.out.println("Jueves");
        } else if (día == 5){
            System.out.println("Viernes");
        } else if (día == 6){
            System.out.println("Sabado");
        } else {
            System.out.println("Domingo");
        }

    }
}
