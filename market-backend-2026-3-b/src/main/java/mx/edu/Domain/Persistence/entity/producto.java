import

@Entity
@Table (name = "productos")
public class producto {

    //Llave privada
    @Id
    //Autoincrementable
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_producto")
    private Integer idproducto;

    private String nombre;

    @Column(name = "Id_categoria")
    private String idCategoria;

    @Column(name = "Codigo_barras")
    private String codigoDeBarras;

    @Column(name = "producto_venta")
    private Integer cantidadStock;

    @Column(name = "cantidad_stock")
    private Boolean estado;

    public Integer getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(Integer idproducto) {
        this.idproducto = idproducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(String idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getCodigoDeBarras() {
        return codigoDeBarras;
    }

    public void setCodigoDeBarras(String codigoDeBarras) {
        this.codigoDeBarras = codigoDeBarras;
    }

    public Integer getCantidadStock() {
        return cantidadStock;
    }

    public void setCantidadStock(Integer cantidadStock) {
        this.cantidadStock = cantidadStock;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}