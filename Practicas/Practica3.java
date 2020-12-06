package Practicas;

import java.util.Scanner;

public class Practica3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Como quieres resolver los ejercicios? ");
        System.out.println("1. If" );
        System.out.println("2. Switch ");
        int num2 = sc.nextInt();
        if (num2 == 1) {
        } else if (num2 == 2) {
        } else {
            System.out.println("Opción incorrecta ");
        }

        switch (num2) {
            case 1:
                System.out.println("Introduce el número de ejercicio que quieres que resuelva: ");
                System.out.println("1. Par-impar ");
                System.out.println("2. Sueldo anual ");
                System.out.println("5. Triángulo válido ");
                System.out.println("6. Fiesta de marmotas ");
                System.out.println("7. Notas");
                int valor = sc.nextInt();
                if (valor==1) {
                    System.out.println("Introduce un número: ");
                    int num = sc.nextInt();
                    if (num % 2 == 0) {
                        System.out.println("El número introducido " + (num) + " es par ");
                    } else {
                        System.out.println("El número introducido " + (num) + " es impar");
                    }
                }else if (valor==2) {
                    System.out.println("Sueldo anual");
                    int sueldo = sc.nextInt();
                    if (sueldo < 9000) {
                        System.out.println("No pagar impuestos ");
                    } else {
                        System.out.println("Debes pagar impuestos ");
                    }
                }else if (valor==5) {
                    System.out.println("Introduce el primer lado: ");
                    int a = sc.nextInt();
                    System.out.println("Introduce el segundo lado: ");
                    int b = sc.nextInt();
                    System.out.println("introduce el tercer lado: ");
                    int c = sc.nextInt();

                    if ((a + b) > c || (a + c) > b || (b + c) > a) {
                        System.out.println("Sí");
                    } else {
                        System.out.println("No");
                    }
                }else if (valor==6) {
                    System.out.println("Introduce el número de tazas: ");
                    int num1 = sc.nextInt();
                    System.out.println("¿Es fin de semana? ");
                    boolean x = sc.nextBoolean();
                    if (num1 >= 15 && num1 <= 25 && x == true) {
                        System.out.println(x);
                    } else if (num1 >= 10 && num1 <= 20 && x == false) {
                        System.out.println(x);
                    }
                }else if (valor==7) {
                    System.out.println("introduce la nota numérica (entre 0 y 10) ");
                    int num = sc.nextInt();

                    if (num >= 0 && num < 3) {
                        System.out.println("MD");
                    }
                    if (3 <= num && num < 5) {
                        System.out.println("INS");
                    }
                    if (5 <= num && num < 6) {
                        System.out.println("SUF");
                    }
                    if (6 <= num && num < 7) {
                        System.out.println("B");
                    }
                    if (7 <= num && num < 9) {
                        System.out.println("N");
                    } else {
                        System.out.println("SB");
                    }
                }else {
                    System.out.println("El ejercicio no forma parte de la practica. ");
                }
                break;
            case 2:
                System.out.println("Introduce el número de ejercicio que quieres que resuelva: ");
                System.out.println("2. Que lenguaje estudia ");
                System.out.println("3. Cadena de texto ");
                System.out.println("4. Identificar cada casa ");
                System.out.println("5. Dirección ");
                int valor2 = sc.nextInt();
                if (valor2==2) {
                    System.out.println("¿Que lenguaje de programación estudias? ");
                    System.out.println("1. Java");
                    System.out.println("2. Kotlin");
                    System.out.println("3. Scala");
                    System.out.println("4. Python");
                    int respuesta = sc.nextInt();

                    switch (respuesta) {
                        case 1:
                            System.out.println("Sí");
                            break;
                        case 2:
                            System.out.println("No");
                            break;
                        case 3:
                            System.out.println("No");
                            break;
                        case 4:
                            System.out.println("No");
                            break;
                    }
                }else if (valor2==3) {
                    String num = "cinco";

                    switch (num) {
                        case "uno":
                            System.out.println("1");
                            break;
                        case "dos":
                            System.out.println("2");
                            break;
                        case "tres":
                            System.out.println("3");
                            break;
                        case "cuatro":
                            System.out.println("4");
                            break;
                        case "cinco":
                            System.out.println("5");
                            break;
                        case "seis":
                            System.out.println("6");
                            break;
                        case "siete":
                            System.out.println("7");
                            break;
                        case "ocho":
                            System.out.println("8");
                            break;
                        case "nueve":
                            System.out.println("9");
                            break;
                    }
                }else if (valor2==4) {
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
                }else if (valor2==5) {
                    System.out.println("Número de dirección: ");
                    int dirección = sc.nextInt();
                    int arriba = 1;
                    int abajo = 2;
                    int izquierda = 3;
                    int derecha = 4;
                    int noMover = 0;

                    switch (dirección) {
                        case 1:
                            System.out.println("subir");
                            break;
                        case 2:
                            System.out.println("bajar");
                            break;
                        case 3:
                            System.out.println("mover a la izquierda");
                            break;
                        case 4:
                            System.out.println("mover a la derecha");
                            break;
                        case 0:
                            System.out.println("no mover");
                            break;
                        default:
                            System.out.println("¡error!");
                    }
                }else {
                    System.out.println("El ejercicio no forma parte de la practica. ");
                }
        }
    }
}
