package ejemploclientesoap;

import co.com.velo.ws.Cliente_Service;
import co.com.velo.ws.ComidaCantidad;
import co.com.velo.ws.Pedido;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

/**
 * @author juan
 */
public class EjemploClienteSoap {

    public static void main(String[] args) throws MalformedURLException {
        Cliente_Service cs = new Cliente_Service(new URL("http://localhost:8080/velobackend/Cliente?wsdl"));
        List<Pedido> pedidos = cs.getClientePort().getPedidos();
        for (Pedido p : pedidos) {
            System.out.println("Pedido " + p.getNombreCliente());
            for (ComidaCantidad c : p.getComidaCantidad()) {
                System.out.println("Comida " + c.getComida().getNombre());
            }
        }
    }
    
}
