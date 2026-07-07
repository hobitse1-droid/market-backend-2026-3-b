@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;
    @Autowired
    private ProductRepository productRepository;

    @GetMapping( "")
    public ResponseEntity<List<Product>> getAll(){
        return ResponseEntity.ok(productService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> getProdcuct(){
        return productService.getProduct()
                .map(ResponsaseEntity::ok) Optional<ResponseEntity<...>>
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/{category/{categoryId}}")
    public ResponseEntity<Product> getByCategory(){@ParhVariable("categoryId") int categoryId
        return productService.getByCategory(categoryId)
                .map(ResponsaseEntity::ok) Optional<ResponseEntity<...>>
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("")
    public ResponseEntity<Product> save(@RecuestBody Product product){
        return ResponseEntity.ok(productService.save(product));
    }

    @DeleteMapping("/{id}")
    public ResposeEtity delete(@PathVAriable("id")int product){
        return ResponseEntity.ok(productService(productId));
    }

}