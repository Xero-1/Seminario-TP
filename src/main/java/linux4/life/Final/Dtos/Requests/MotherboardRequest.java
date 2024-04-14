package linux4.life.Final.Dtos.Requests;

import lombok.Data;

import java.util.List;

@Data
public class MotherboardRequest
{
    private ProductRequest product;
    private String socket;
    private List<ProcessorRequest> processors_supported;
}
