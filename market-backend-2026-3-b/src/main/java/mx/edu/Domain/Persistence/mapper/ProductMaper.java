import org.mapstruct.Mapper

@Mapper(componentModel ="spring", uses= CategoryMapper.class)
public interface ProductMaper {
    @Mappings({
            @Mapping(source = "idProducto", target = "productoId"),
            @Mapping(source = "nombre", target = "name"),
            @Mapping(source = "precioVenta", target = "price"),
            @Mapping(source = "cantidadStock", target = "stock"),
            @Mapping(source = "estado", target = "active"),
            @Mapping(source = "categoria", target = "category"),
    })
    product toProduct(producto producto)
        LIst<Product> toProducts(LIst<Producto> productos)
    @InheritInverseConfiguration
    @Mapping(target = "codigoBarras", ignore = true)
    producto toProducto(product product)
}