package linux4.life.Final.Dtos.Responses;

import lombok.Builder;
import lombok.Data;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Builder
@Data
@Produces(MediaType.APPLICATION_JSON)
public class ProductsResponse
{
    private List<ProductResponse> products;
}
