
package co.com.velo.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the co.com.velo.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ComidaCantidad_QNAME = new QName("http://velo.com.co/", "comidaCantidad");
    private final static QName _GetPedidosResponse_QNAME = new QName("http://velo.com.co/", "getPedidosResponse");
    private final static QName _EntregarPedidoResponse_QNAME = new QName("http://velo.com.co/", "entregarPedidoResponse");
    private final static QName _GetCategorias_QNAME = new QName("http://velo.com.co/", "getCategorias");
    private final static QName _GetCategoriasResponse_QNAME = new QName("http://velo.com.co/", "getCategoriasResponse");
    private final static QName _GuardarCategoriaResponse_QNAME = new QName("http://velo.com.co/", "guardarCategoriaResponse");
    private final static QName _GetMenu_QNAME = new QName("http://velo.com.co/", "getMenu");
    private final static QName _GetPedidosPendientes_QNAME = new QName("http://velo.com.co/", "getPedidosPendientes");
    private final static QName _Pedido_QNAME = new QName("http://velo.com.co/", "pedido");
    private final static QName _Comida_QNAME = new QName("http://velo.com.co/", "comida");
    private final static QName _GuardarCategoria_QNAME = new QName("http://velo.com.co/", "guardarCategoria");
    private final static QName _EntregarPedido_QNAME = new QName("http://velo.com.co/", "entregarPedido");
    private final static QName _GetPedidosEntregadosResponse_QNAME = new QName("http://velo.com.co/", "getPedidosEntregadosResponse");
    private final static QName _GetMenuResponse_QNAME = new QName("http://velo.com.co/", "getMenuResponse");
    private final static QName _GuardarComidaResponse_QNAME = new QName("http://velo.com.co/", "guardarComidaResponse");
    private final static QName _Categoria_QNAME = new QName("http://velo.com.co/", "categoria");
    private final static QName _GuardarComida_QNAME = new QName("http://velo.com.co/", "guardarComida");
    private final static QName _GetPedidos_QNAME = new QName("http://velo.com.co/", "getPedidos");
    private final static QName _HacerPedidoResponse_QNAME = new QName("http://velo.com.co/", "hacerPedidoResponse");
    private final static QName _GetPedidosEntregados_QNAME = new QName("http://velo.com.co/", "getPedidosEntregados");
    private final static QName _GetPedidosPendientesResponse_QNAME = new QName("http://velo.com.co/", "getPedidosPendientesResponse");
    private final static QName _HacerPedido_QNAME = new QName("http://velo.com.co/", "hacerPedido");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: co.com.velo.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetMenuResponse }
     * 
     */
    public GetMenuResponse createGetMenuResponse() {
        return new GetMenuResponse();
    }

    /**
     * Create an instance of {@link GuardarComidaResponse }
     * 
     */
    public GuardarComidaResponse createGuardarComidaResponse() {
        return new GuardarComidaResponse();
    }

    /**
     * Create an instance of {@link Categoria }
     * 
     */
    public Categoria createCategoria() {
        return new Categoria();
    }

    /**
     * Create an instance of {@link GuardarComida }
     * 
     */
    public GuardarComida createGuardarComida() {
        return new GuardarComida();
    }

    /**
     * Create an instance of {@link GetPedidos }
     * 
     */
    public GetPedidos createGetPedidos() {
        return new GetPedidos();
    }

    /**
     * Create an instance of {@link HacerPedidoResponse }
     * 
     */
    public HacerPedidoResponse createHacerPedidoResponse() {
        return new HacerPedidoResponse();
    }

    /**
     * Create an instance of {@link GetPedidosEntregados }
     * 
     */
    public GetPedidosEntregados createGetPedidosEntregados() {
        return new GetPedidosEntregados();
    }

    /**
     * Create an instance of {@link GetPedidosPendientesResponse }
     * 
     */
    public GetPedidosPendientesResponse createGetPedidosPendientesResponse() {
        return new GetPedidosPendientesResponse();
    }

    /**
     * Create an instance of {@link HacerPedido }
     * 
     */
    public HacerPedido createHacerPedido() {
        return new HacerPedido();
    }

    /**
     * Create an instance of {@link ComidaCantidad }
     * 
     */
    public ComidaCantidad createComidaCantidad() {
        return new ComidaCantidad();
    }

    /**
     * Create an instance of {@link GetPedidosResponse }
     * 
     */
    public GetPedidosResponse createGetPedidosResponse() {
        return new GetPedidosResponse();
    }

    /**
     * Create an instance of {@link EntregarPedidoResponse }
     * 
     */
    public EntregarPedidoResponse createEntregarPedidoResponse() {
        return new EntregarPedidoResponse();
    }

    /**
     * Create an instance of {@link GetCategorias }
     * 
     */
    public GetCategorias createGetCategorias() {
        return new GetCategorias();
    }

    /**
     * Create an instance of {@link GetCategoriasResponse }
     * 
     */
    public GetCategoriasResponse createGetCategoriasResponse() {
        return new GetCategoriasResponse();
    }

    /**
     * Create an instance of {@link GuardarCategoriaResponse }
     * 
     */
    public GuardarCategoriaResponse createGuardarCategoriaResponse() {
        return new GuardarCategoriaResponse();
    }

    /**
     * Create an instance of {@link GetMenu }
     * 
     */
    public GetMenu createGetMenu() {
        return new GetMenu();
    }

    /**
     * Create an instance of {@link GetPedidosPendientes }
     * 
     */
    public GetPedidosPendientes createGetPedidosPendientes() {
        return new GetPedidosPendientes();
    }

    /**
     * Create an instance of {@link Pedido }
     * 
     */
    public Pedido createPedido() {
        return new Pedido();
    }

    /**
     * Create an instance of {@link Comida }
     * 
     */
    public Comida createComida() {
        return new Comida();
    }

    /**
     * Create an instance of {@link GuardarCategoria }
     * 
     */
    public GuardarCategoria createGuardarCategoria() {
        return new GuardarCategoria();
    }

    /**
     * Create an instance of {@link EntregarPedido }
     * 
     */
    public EntregarPedido createEntregarPedido() {
        return new EntregarPedido();
    }

    /**
     * Create an instance of {@link GetPedidosEntregadosResponse }
     * 
     */
    public GetPedidosEntregadosResponse createGetPedidosEntregadosResponse() {
        return new GetPedidosEntregadosResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ComidaCantidad }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://velo.com.co/", name = "comidaCantidad")
    public JAXBElement<ComidaCantidad> createComidaCantidad(ComidaCantidad value) {
        return new JAXBElement<ComidaCantidad>(_ComidaCantidad_QNAME, ComidaCantidad.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPedidosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://velo.com.co/", name = "getPedidosResponse")
    public JAXBElement<GetPedidosResponse> createGetPedidosResponse(GetPedidosResponse value) {
        return new JAXBElement<GetPedidosResponse>(_GetPedidosResponse_QNAME, GetPedidosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntregarPedidoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://velo.com.co/", name = "entregarPedidoResponse")
    public JAXBElement<EntregarPedidoResponse> createEntregarPedidoResponse(EntregarPedidoResponse value) {
        return new JAXBElement<EntregarPedidoResponse>(_EntregarPedidoResponse_QNAME, EntregarPedidoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCategorias }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://velo.com.co/", name = "getCategorias")
    public JAXBElement<GetCategorias> createGetCategorias(GetCategorias value) {
        return new JAXBElement<GetCategorias>(_GetCategorias_QNAME, GetCategorias.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCategoriasResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://velo.com.co/", name = "getCategoriasResponse")
    public JAXBElement<GetCategoriasResponse> createGetCategoriasResponse(GetCategoriasResponse value) {
        return new JAXBElement<GetCategoriasResponse>(_GetCategoriasResponse_QNAME, GetCategoriasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GuardarCategoriaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://velo.com.co/", name = "guardarCategoriaResponse")
    public JAXBElement<GuardarCategoriaResponse> createGuardarCategoriaResponse(GuardarCategoriaResponse value) {
        return new JAXBElement<GuardarCategoriaResponse>(_GuardarCategoriaResponse_QNAME, GuardarCategoriaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMenu }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://velo.com.co/", name = "getMenu")
    public JAXBElement<GetMenu> createGetMenu(GetMenu value) {
        return new JAXBElement<GetMenu>(_GetMenu_QNAME, GetMenu.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPedidosPendientes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://velo.com.co/", name = "getPedidosPendientes")
    public JAXBElement<GetPedidosPendientes> createGetPedidosPendientes(GetPedidosPendientes value) {
        return new JAXBElement<GetPedidosPendientes>(_GetPedidosPendientes_QNAME, GetPedidosPendientes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Pedido }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://velo.com.co/", name = "pedido")
    public JAXBElement<Pedido> createPedido(Pedido value) {
        return new JAXBElement<Pedido>(_Pedido_QNAME, Pedido.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Comida }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://velo.com.co/", name = "comida")
    public JAXBElement<Comida> createComida(Comida value) {
        return new JAXBElement<Comida>(_Comida_QNAME, Comida.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GuardarCategoria }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://velo.com.co/", name = "guardarCategoria")
    public JAXBElement<GuardarCategoria> createGuardarCategoria(GuardarCategoria value) {
        return new JAXBElement<GuardarCategoria>(_GuardarCategoria_QNAME, GuardarCategoria.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntregarPedido }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://velo.com.co/", name = "entregarPedido")
    public JAXBElement<EntregarPedido> createEntregarPedido(EntregarPedido value) {
        return new JAXBElement<EntregarPedido>(_EntregarPedido_QNAME, EntregarPedido.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPedidosEntregadosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://velo.com.co/", name = "getPedidosEntregadosResponse")
    public JAXBElement<GetPedidosEntregadosResponse> createGetPedidosEntregadosResponse(GetPedidosEntregadosResponse value) {
        return new JAXBElement<GetPedidosEntregadosResponse>(_GetPedidosEntregadosResponse_QNAME, GetPedidosEntregadosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMenuResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://velo.com.co/", name = "getMenuResponse")
    public JAXBElement<GetMenuResponse> createGetMenuResponse(GetMenuResponse value) {
        return new JAXBElement<GetMenuResponse>(_GetMenuResponse_QNAME, GetMenuResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GuardarComidaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://velo.com.co/", name = "guardarComidaResponse")
    public JAXBElement<GuardarComidaResponse> createGuardarComidaResponse(GuardarComidaResponse value) {
        return new JAXBElement<GuardarComidaResponse>(_GuardarComidaResponse_QNAME, GuardarComidaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Categoria }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://velo.com.co/", name = "categoria")
    public JAXBElement<Categoria> createCategoria(Categoria value) {
        return new JAXBElement<Categoria>(_Categoria_QNAME, Categoria.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GuardarComida }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://velo.com.co/", name = "guardarComida")
    public JAXBElement<GuardarComida> createGuardarComida(GuardarComida value) {
        return new JAXBElement<GuardarComida>(_GuardarComida_QNAME, GuardarComida.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPedidos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://velo.com.co/", name = "getPedidos")
    public JAXBElement<GetPedidos> createGetPedidos(GetPedidos value) {
        return new JAXBElement<GetPedidos>(_GetPedidos_QNAME, GetPedidos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HacerPedidoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://velo.com.co/", name = "hacerPedidoResponse")
    public JAXBElement<HacerPedidoResponse> createHacerPedidoResponse(HacerPedidoResponse value) {
        return new JAXBElement<HacerPedidoResponse>(_HacerPedidoResponse_QNAME, HacerPedidoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPedidosEntregados }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://velo.com.co/", name = "getPedidosEntregados")
    public JAXBElement<GetPedidosEntregados> createGetPedidosEntregados(GetPedidosEntregados value) {
        return new JAXBElement<GetPedidosEntregados>(_GetPedidosEntregados_QNAME, GetPedidosEntregados.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPedidosPendientesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://velo.com.co/", name = "getPedidosPendientesResponse")
    public JAXBElement<GetPedidosPendientesResponse> createGetPedidosPendientesResponse(GetPedidosPendientesResponse value) {
        return new JAXBElement<GetPedidosPendientesResponse>(_GetPedidosPendientesResponse_QNAME, GetPedidosPendientesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HacerPedido }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://velo.com.co/", name = "hacerPedido")
    public JAXBElement<HacerPedido> createHacerPedido(HacerPedido value) {
        return new JAXBElement<HacerPedido>(_HacerPedido_QNAME, HacerPedido.class, null, value);
    }

}
