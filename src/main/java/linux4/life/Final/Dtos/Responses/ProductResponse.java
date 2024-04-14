package linux4.life.Final.Dtos.Responses;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ProductResponse
{
    private String name;
    private String description;
    private float price;
}
