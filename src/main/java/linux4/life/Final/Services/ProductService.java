package linux4.life.Final.Services;

import linux4.life.Final.Dtos.Requests.ProductRequest;
import linux4.life.Final.Dtos.Responses.ProductsResponse;
import linux4.life.Final.Mappers.ProductMapper;
import linux4.life.Final.models.Product;
import linux4.life.Final.Repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService
{
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private ProductMapper productMapper;

    /******CRUD******/
    public ResponseEntity addProduct(ProductRequest productRequest)
    {
        Product product=productRequestToNewProduct(productRequest);
        saveProduct(product);
        return ResponseEntity.ok("New product: "+product.getName()+" added.");
    }
    public ResponseEntity updateProduct(ProductRequest productRequest,Long id)
    {
        try
        {
            Product product=productRepository.getById(id);
            product=productRequestToExistedProduct(productRequest);
            productRepository.save(product);
            return ResponseEntity.ok("Product updated.");
        }
        catch(Exception e)
        {
            return ResponseEntity.badRequest().body("Product with id= "+id+" not founded.");
        }
    }
    public void saveProduct(Product product)
    {
        productRepository.save(product);
    }
    public void deleteProduct(Long id)
    {
        productRepository.deleteById(id);
    }
    public ProductsResponse listProducts()
    {
        List<Product> listProducts=productRepository.findAll();
        return productMapper.productsListToResponse(listProducts);
    }
    /******/
    public Product productRequestToNewProduct(ProductRequest productRequest)
    {
        return productMapper.productRequestToProduct(productRequest);
    }
    public Product productRequestToExistedProduct(ProductRequest productRequest)
    {
        return productMapper.productRequestToProduct(productRequest);
    }
}
