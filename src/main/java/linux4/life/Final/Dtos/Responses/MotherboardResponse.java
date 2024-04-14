package linux4.life.Final.Dtos.Responses;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
public class MotherboardResponse
{
    private ProductResponse product;
    private String socket;
    private List<ProcessorResponse> processors_supported;
}
