import java.io.FileNotFoundException;
import java.io.IOException;
import javax.xml.stream.XMLStreamException;


public class Main {


    public static void main(String[] args) throws ClassNotFoundException, IOException, FileNotFoundException, FileNotFoundException, XMLStreamException, XMLStreamException, XMLStreamException, XMLStreamException {
        Metodos obx = new Metodos();
        String rutaEsc = "/media/sf_Compartida/xml/ejercicio2/products.xml";
        String rutaLeer = "C:\\Users\\crist\\Documents\\DAM2\\AD\\serializacion2\\productos.dat";
        //obx.escribirProducts(rutaEsc, rutaLeer);
        obx.leer(rutaEsc);
    }

}