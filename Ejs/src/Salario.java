public class Salario {
    public static void main(String[] args) {
        int horasTrabajadas, horasExtras, salarioSemanal;
        horasTrabajadas = 77;
        if (horasTrabajadas > 40 ) {
            horasExtras = horasTrabajadas - 40;
            salarioSemanal = horasExtras * 20 + 40 * 16;
            System.out.println("El salario con horas extras es de: " + salarioSemanal);
        }else{
            salarioSemanal = horasTrabajadas * 16;
            System.out.println("Su sueldo es de " + salarioSemanal);

        }

    }

    }
