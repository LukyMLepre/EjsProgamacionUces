public class Compra {
    public static void main(String[] args){
        double compra, descuento, total = 0;
        compra = 410;
        descuento = compra*0.2;
        total = compra;
        if (compra>300) {
            total = compra - descuento;
            System.out.println("El descuento es de: " + descuento);
            System.out.println("El total a pagar es: " + total);
        } else{
            System.out.println("Sin descuentos, el total es: "+ total);

        }
        }
}
