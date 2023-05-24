package src;

public class MayorDeTres2 {
    public static void main(String args []) {
        int a = 55;
        int b = 27;
        int c = 115;

        if ((a > b) && (a > c)) {
            System.out.println("El mayor es: " + a);

        } else if ((b > a) && (b > c)) {
            System.out.println("El mayor es: " + b);

        } else {
            System.out.println("El mayor es: " + c);
        }

    }

}
