
/**
 * Clase Alimento.
 * Representa los productos alimenticios.
 * Hereda los atributos comunes de Producto.
 */
public class Alimento extends Producto {

    // Atributo exclusivo de los alimentos.
    private String fechaCaducidad;

    /**
     * Constructor de Alimento.
     */
    public Alimento(
            String nombre,
            double precio,
            int stock,
            String fechaCaducidad) {

        super(nombre, precio, stock);

        this.fechaCaducidad = fechaCaducidad;
    }

    /**
     * Muestra la información específica del alimento.
     */
    @Override
    public void mostrarInformacion() {

        System.out.println("Producto alimenticio");
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Stock: " + stock);
        System.out.println(
            "Caducidad: " + fechaCaducidad
        );

        System.out.println(
            "Valor del inventario: $"
            + calcularValorInventario()
        );
    }
}
