public class Anidado {
    public static void main (String args[]){
        int scanner = 1;
        int num1 = 8;
        int num2 = 4;
        int resultado = 0;

        if( scanner == 1) {
            resultado = num1 + num2;
            System.out.println("El resultado de la suma es: " + resultado);
        }else if(scanner == 2) {
            resultado = num1 - num2;
            System.out.println("El resultado de la resta es: " + resultado);
        }else if(scanner == 3) {
            resultado = num1 + num2;
            System.out.println("El resultado de la multiplicacion es: " + resultado);
        }else if(scanner == 4){
            resultado = num1 / num2;
            System.out.println("El resultado de la division es: "+ resultado);
        }
    }

    }
