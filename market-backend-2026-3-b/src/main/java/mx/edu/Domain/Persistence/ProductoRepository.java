public class ProductoRepository {
    private ProductoCrudRepository productoCrudRepository;

    //Select * From Productos
    public List<Producto> getAll() {
        //Se "castea" Iterable a lista
        return (List<Producto>) productoCrudRepository.findAll();
    }
}