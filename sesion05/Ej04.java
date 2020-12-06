package sesion05;

import java.util.Scanner;

public class Ej04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Identificación de cada casa: ");
        int casa = sc.nextInt();
        int gryffindor = 1;
        int hufflepuff = 2;
        int slytherin = 3;
        int ravenclaw = 4;

        switch (casa) {
            case 1:
                System.out.println("griffindor: valentía");
                break;
            case 2:
                System.out.println("hufflepuff: lealtad");
                break;
            case 3:
                System.out.println("slytherin: astucia");
                break;
            case 4:
                System.out.println("ravenclaw: intelecto");
                break;
            default:
                System.out.println("no es una casa válida");
        }

    }
}
