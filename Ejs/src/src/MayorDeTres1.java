package src;

public class MayorDeTres1 {
    public static void main(String args []) {
        int n1 = 55;
        int n2 = 27;
        int n3 = 115;

        if ((n1 > n2) && (n1 > n3)) {
            System.out.println("El mayor es: "+ n1);

        } else if (n2 > n3) {
            System.out.println("El mayor es: "+ n2);

        } else {
            System.out.println("El mayor es: " + n3);
        }
    }
}
