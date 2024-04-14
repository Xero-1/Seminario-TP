package linux4.life.Final.Dtos.Requests;

import lombok.Data;

@Data
public class ProcessorRequest
{
    private ProductRequest product;
    private String model;
    private boolean has_apu;
    private int nr_cores;
    private int nr_threads;
}
