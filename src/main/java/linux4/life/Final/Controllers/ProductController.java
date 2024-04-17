package linux4.life.Final.Controllers;

import linux4.life.Final.Dtos.Requests.ProductRequest;
import linux4.life.Final.Dtos.Responses.ProductsResponse;
import linux4.life.Final.Services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.Produces;
import java.sql.SQLException;

@RequestMapping("/product")
@RestController
public class ProductController
{
    @Autowired
    private ProductService productService;

    @PostMapping("/newProduct")
    @Produces(MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity addProduct(@RequestBody ProductRequest productRequest)
    {
        return productService.addProduct(productRequest);
    }
    @PutMapping("/updateProduct/{id}")
    @Produces(MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity updateProduct(@PathVariable("id") Long id,@RequestBody ProductRequest productRequest)
    {
        return productService.updateProduct(productRequest,id);
    }
    @DeleteMapping("/deleteProduct/{id}")
    @Produces(MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity deleteProduct(@PathVariable("id") Long id) throws SQLException
    {
        try
        {
            productService.deleteProduct(id);
            return ResponseEntity.ok("Producto eliminado");
        }catch(Exception ex)
        {
            return ResponseEntity.badRequest().body("No se pudo eliminar el producto.ERROR= "+ex.getMessage());
        }
    }
    @GetMapping()
    @Produces(MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ProductsResponse listProducts()
    {
        return productService.listProducts();
    }
}
