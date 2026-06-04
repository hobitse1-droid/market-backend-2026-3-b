import org.mapstruct.Mapper

@Mapper(componentModel ="spring")
public interface CategoryMapper {
    @Mappings({
    @Mappings(source = "idCategoria", target = "categoryId"),
    @Mappings(source = "decripcion", target = "category"),
    @Mappings(source = "estado", target = "active"),
    })

    Category toCategory(Categoria categoria);

    @InheritInverseConfiguration
    @Mapping(target = "productos", ignore = true)
    Categoria toCategoria(Category category);
}