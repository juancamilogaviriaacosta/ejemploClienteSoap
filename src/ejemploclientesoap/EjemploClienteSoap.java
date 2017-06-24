package ejemploclientesoap;

import co.com.velo.ws.Cliente_Service;
import co.com.velo.ws.ComidaCantidad;
import co.com.velo.ws.Pedido;
import java.util.List;

/**
 *
 * @author juan
 */
public class EjemploClienteSoap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente_Service cs = new Cliente_Service();
        List<Pedido> pedidos = cs.getClientePort().getPedidos();
        for (Pedido p : pedidos) {
            System.out.println("Pedido " + p.getNombreCliente());
            for (ComidaCantidad c : p.getComidaCantidad()) {
                System.out.println("Comida " + c.getComida().getNombre());
            }
        }
    }
    
}
