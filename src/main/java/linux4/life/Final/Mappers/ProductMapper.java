package linux4.life.Final.Mappers;

import linux4.life.Final.Dtos.Requests.ProductRequest;
import linux4.life.Final.Dtos.Responses.ProductResponse;
import linux4.life.Final.Dtos.Responses.ProductsResponse;
import linux4.life.Final.models.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductMapper
{
    public Product productRequestToProduct(ProductRequest productRequest)
    {
        Product product=Product.builder()
                .name(productRequest.getName())
                .description(productRequest.getDescription())
                .price(productRequest.getPrice())
                .build();
        return product;
    }
    public ProductsResponse productsListToResponse(List<Product> products)
    {
        List<ProductResponse> productResponseList=new ArrayList<>();
        for(Product p:products)
        {
            ProductResponse productResponse= ProductResponse.builder()
                    .name(p.getName())
                    .description(p.getDescription())
                    .price(p.getPrice())
                    .build();
            productResponseList.add(productResponse);
        }
        ProductsResponse productsResponse=ProductsResponse.builder()
                .products(productResponseList)
                .build();
        return productsResponse;
    }
}
