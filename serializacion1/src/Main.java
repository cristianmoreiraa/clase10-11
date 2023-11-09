import javax.swing.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        mClase ObjGrabar = new mClase("Hola",-7,2.7E10);
        try {
            //Definimos ruta fichero
            String rutaFichero = JOptionPane.showInputDialog("Introduce la ruta del archivo: ");
            //String rutaFichero = "C:\\Users\\crist\\Documents\\AD\\serial.txt";

            // Crear un FileOutputStream y ObjectOutputStream para escribir en el archivo
            FileOutputStream fileOutputStream = new FileOutputStream(rutaFichero);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            //Escribimos objeto en el archivo
            objectOutputStream.writeObject(ObjGrabar);

            //Cerramos el ObjectOutputStream y el FileOutputStream
            objectOutputStream.close();
            fileOutputStream.close();

            System.out.println("Se ha serializado y almacenado de manera correcta en el archivo 'Serial'");

        } catch (FileNotFoundException e) {
            e.printStackTrace();

        }
    }
}