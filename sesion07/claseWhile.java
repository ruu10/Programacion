package sesion07;

public class claseWhile {
    public static void main(String[] args) {
        int num = 10;
        while (num > 1) {
            System.out.print(num + " ");
            num--; //num = num - 1;
        }
        System.out.println("Después del bucle: " + num);
    }
}
