
package co.com.velo.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para guardarComida complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="guardarComida">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="disponibilidad" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="precioBase" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="tiempoPreparacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="caracteristicas" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idCategoria" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "guardarComida", propOrder = {
    "nombre",
    "disponibilidad",
    "precioBase",
    "tiempoPreparacion",
    "caracteristicas",
    "idCategoria"
})
public class GuardarComida {

    protected String nombre;
    protected Boolean disponibilidad;
    protected Integer precioBase;
    protected String tiempoPreparacion;
    protected String caracteristicas;
    protected Integer idCategoria;

    /**
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Obtiene el valor de la propiedad disponibilidad.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisponibilidad() {
        return disponibilidad;
    }

    /**
     * Define el valor de la propiedad disponibilidad.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisponibilidad(Boolean value) {
        this.disponibilidad = value;
    }

    /**
     * Obtiene el valor de la propiedad precioBase.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPrecioBase() {
        return precioBase;
    }

    /**
     * Define el valor de la propiedad precioBase.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPrecioBase(Integer value) {
        this.precioBase = value;
    }

    /**
     * Obtiene el valor de la propiedad tiempoPreparacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTiempoPreparacion() {
        return tiempoPreparacion;
    }

    /**
     * Define el valor de la propiedad tiempoPreparacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTiempoPreparacion(String value) {
        this.tiempoPreparacion = value;
    }

    /**
     * Obtiene el valor de la propiedad caracteristicas.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaracteristicas() {
        return caracteristicas;
    }

    /**
     * Define el valor de la propiedad caracteristicas.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaracteristicas(String value) {
        this.caracteristicas = value;
    }

    /**
     * Obtiene el valor de la propiedad idCategoria.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdCategoria() {
        return idCategoria;
    }

    /**
     * Define el valor de la propiedad idCategoria.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdCategoria(Integer value) {
        this.idCategoria = value;
    }

}
