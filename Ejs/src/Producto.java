public class Producto {
    private String nombre;
    private double precio;
    private int cantidad;

    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public double calcularValorTotal() {
        return precio * cantidad;
    }

    public static void main(String[] args) {
        Producto[] productos = new Producto[3];
        productos[0] = new Producto("Camiseta", 27.50, 3);
        productos[1] = new Producto("Short", 36.36, 2);
        productos[2] = new Producto("Medias", 60.0, 1);

        for (Producto producto : productos) {
            double valorTotal = producto.calcularValorTotal();
            System.out.println("Nombre del producto: " + producto.getNombre());
            System.out.println("Valor total: " + valorTotal);
            System.out.println();
        }
    }
}
