
/**
 * Interfaz Inventariable.
 * Define las operaciones comunes para administrar
 * los productos del inventario.
 */
public interface Inventariable {

    /**
     * Actualiza la cantidad disponible del producto.
     */
    void actualizarStock(int cantidad);

    /**
     * Calcula el valor total del inventario.
     */
    double calcularValorInventario();
}
