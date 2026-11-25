
/**
 * Clase abstracta Producto.
 * Contiene los atributos y métodos comunes
 * para todos los productos del inventario.
 *
 * Implementa la interfaz Inventariable.
 */
public abstract class Producto implements Inventariable {

    // Atributos protegidos comunes a todos los productos.
    protected String nombre;
    protected double precio;
    protected int stock;

    /**
     * Constructor que inicializa los datos del producto.
     */
    public Producto(String nombre, double precio, int stock) {

        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    /**
     * Método abstracto que será implementado
     * por cada clase derivada.
     */
    public abstract void mostrarInformacion();

    /**
     * Actualiza las existencias del producto.
     * Permite agregar o retirar unidades.
     */
    @Override
    public void actualizarStock(int cantidad) {

        if (stock + cantidad >= 0) {

            stock += cantidad;

            System.out.println(
                "Stock actualizado de " + nombre
                + ": " + stock
            );

        } else {

            System.out.println(
                "Error: no hay suficiente stock."
            );
        }
    }

    /**
     * Calcula el valor total del inventario
     * multiplicando el precio por las existencias.
     */
    @Override
    public double calcularValorInventario() {

        return precio * stock;
    }
}
