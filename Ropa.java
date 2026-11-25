
/**
 * Clase Ropa.
 * Representa los productos de vestimenta.
 * Hereda los atributos y métodos de Producto.
 */
public class Ropa extends Producto {

    // Atributo exclusivo de los productos de ropa.
    private String talla;

    /**
     * Constructor de Ropa.
     * Inicializa los datos comunes y la talla.
     */
    public Ropa(
            String nombre,
            double precio,
            int stock,
            String talla) {

        super(nombre, precio, stock);

        this.talla = talla;
    }

    /**
     * Muestra la información específica de la ropa.
     * Sobrescribe el método de la clase padre.
     */
    @Override
    public void mostrarInformacion() {

        System.out.println("Producto de ropa");
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Stock: " + stock);
        System.out.println("Talla: " + talla);

        System.out.println(
            "Valor del inventario: $"
            + calcularValorInventario()
        );
    }
}