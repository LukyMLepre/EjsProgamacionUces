import java.util.Scanner;

public class Ejercicio01ArrayEntero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de estudiantes: ");
        int cantidadEstudiantes = scanner.nextInt();

        double[] calificaciones = new double[cantidadEstudiantes];

        for (int i = 0; i < cantidadEstudiantes; i++) {
            System.out.print("Ingrese la calificación del estudiante " + (i + 1) + ": ");
            calificaciones[i] = scanner.nextDouble();
        }

        double suma = 0;
        for (double calificacion : calificaciones) {
            suma += calificacion;
        }
        double promedio = suma / cantidadEstudiantes;

        System.out.println("El promedio de las calificaciones es: " + promedio);

        scanner.close();
    }
}