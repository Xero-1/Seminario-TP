package linux4.life.Final.Dtos.Responses;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ProcessorResponse
{
    private ProductResponse product;
    private boolean has_apu;
    private int nr_cores;
    private int nr_threads;
}
