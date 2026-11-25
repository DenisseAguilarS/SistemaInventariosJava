
/**
 * Clase Electronico.
 * Hereda los atributos y métodos de Producto.
 * Agrega el atributo específico de garantía.
 */
public class Electronico extends Producto {

    // Atributo exclusivo de los productos electrónicos.
    private int garantiaMeses;

    /**
     * Constructor de Electronico.
     * Inicializa los datos comunes y la garantía.
     */
    public Electronico(
            String nombre,
            double precio,
            int stock,
            int garantiaMeses) {

        super(nombre, precio, stock);

        this.garantiaMeses = garantiaMeses;
    }

    /**
     * Implementación específica del método abstracto.
     */
    @Override
    public void mostrarInformacion() {

        System.out.println("Producto electrónico");
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Stock: " + stock);
        System.out.println(
            "Garantía: " + garantiaMeses + " meses"
        );

        System.out.println(
            "Valor del inventario: $"
            + calcularValorInventario()
        );
    }
}

