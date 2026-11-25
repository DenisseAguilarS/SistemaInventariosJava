
/**
 * Clase Main.
 * Contiene el método principal del sistema.
 * Crea productos y demuestra el polimorfismo.
 */
public class Main {

    public static void main(String[] args) {

        // Crear un producto electrónico.
        Producto producto1 = new Electronico(
            "Laptop",
            15000,
            5,
            12
        );

        // Crear un producto alimenticio.
        Producto producto2 = new Alimento(
            "Leche",
            25,
            20,
            "2026-12-15"
        );

        // Crear un producto de ropa.
        Producto producto3 = new Ropa(
            "Playera",
            180,
            10,
            "M"
        );

        // Arreglo que almacena diferentes tipos
        // de productos utilizando una misma clase.
        Producto[] inventario = {
            producto1,
            producto2,
            producto3
        };

        // Recorrer todos los productos del inventario.
        for (Producto producto : inventario) {

            // Llamada polimórfica.
            producto.mostrarInformacion();

            System.out.println("--------------------");
        }

        // Agregar dos unidades al producto electrónico.
        producto1.actualizarStock(2);

        // Mostrar el valor actualizado del producto.
        System.out.println(
            "Valor actualizado: $"
            + producto1.calcularValorInventario()
        );
    }
}