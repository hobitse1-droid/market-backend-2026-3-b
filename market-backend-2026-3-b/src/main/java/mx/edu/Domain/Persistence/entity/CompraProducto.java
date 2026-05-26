import java.io.Serializable

@Embeddable
public class CompraproductoPK implements Serializable{

    @Column(name = "id_compra")
    private Integer idCompra;

    @Column(neme = "id_producto")
    private Integer idProducto;

    public Integer getIdCompra()
        return idCompra;
}