import java.io.*;

public class Main {
    public static void main(String[] args) {
        // Datos de productos
        String[] cod = {"p1", "p2", "p3"};
        String[] desc = {"tornillos", "clavos", "fallos"};
        int[] precio = {3, 4, 5};

        try {
            // Crear objetos Product y serializarlos en un archivo binario
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("productos.dat"));

            for (int i = 0; i < cod.length; i++) {
                Product product = new Product(cod[i], desc[i], precio[i]);
                outputStream.writeObject(product);
            }

            // Almacenar un objeto nulo para indicar el final
            outputStream.writeObject(null);

            // Cerrar el flujo de salida
            outputStream.close();

            // Leer objetos desde el archivo
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("productos.dat"));

            Product product;
            while ((product = (Product) inputStream.readObject()) != null) {
                // Imprimir cada producto
                System.out.println(product);
            }

            // Cerrar el flujo de entrada
            inputStream.close();
        } catch (EOFException e) {
            System.out.println("Fin del archivo.");
        } catch (FileNotFoundException e) {
            System.err.println("Error: No se encontró el archivo.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
