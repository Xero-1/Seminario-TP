package linux4.life.Final.Mappers;

import linux4.life.Final.Dtos.Requests.ProcessorRequest;
import linux4.life.Final.Models.Product;
import org.springframework.stereotype.Service;

@Service
public class ProcessorMapper
{
    public Product processorRequestToProduct(ProcessorRequest processorRequest)
    {
        Product product=Product.builder()
                .name(processorRequest.getProduct().getName())
                .description(processorRequest.getProduct().getDescription())
                .price(processorRequest.getProduct().getPrice())
                .build();
        return product;
    }
}
