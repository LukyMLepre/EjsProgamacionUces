package src;

import java.util.*;
public class ParImpar {
    public static void main (String args[]){
Scanner sc = new Scanner(System.in);
int Numero;
System.out.print("Introduzca Numero entero: ");
Numero = sc.nextInt();
if(Numero%2==0) {
    System.out.println("Par");
}else{
    System.out.println("Impar");
}
}
    }