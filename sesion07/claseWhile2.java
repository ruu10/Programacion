package sesion07;

public class claseWhile2 {
    public static void main(String[] args) {
        char letra = 'A';
        while (letra < 'Z') {
            System.out.print(letra + " ");
            letra++; //
        }
        System.out.println("Después del bucle: " + letra);
    }
}

