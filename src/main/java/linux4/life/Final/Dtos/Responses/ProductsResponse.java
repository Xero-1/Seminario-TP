package linux4.life.Final.Dtos.Responses;

import lombok.Builder;

import java.util.List;

@Builder
public class ProductsResponse
{
    private List<ProductResponse> products;
}
