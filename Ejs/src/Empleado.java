public class Empleado {
    private String nombre;
    private double salario;
    private int antiguedad;

    public Empleado(String nombre, double salario, int antiguedad) {
        this.nombre = nombre;
        this.salario = salario;
        this.antiguedad = antiguedad;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalario() {
        return salario;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void aplicarAumento() {
        if (antiguedad > 5) {
            salario *= 1.1; // Aumento del 10%
        }
    }

    public static void main(String[] args) {
        Empleado[] empleados = new Empleado[3];
        empleados[0] = new Empleado("Gino", 2000.0, 3);
        empleados[1] = new Empleado("Lucas", 2500.0, 6);
        empleados[2] = new Empleado("Matias", 1800.0, 8);

        for (Empleado empleado : empleados) {
            empleado.aplicarAumento();
            System.out.println("Nombre del empleado: " + empleado.getNombre());
            System.out.println("Salario actualizado: " + empleado.getSalario());
            System.out.println();
        }
    }
}