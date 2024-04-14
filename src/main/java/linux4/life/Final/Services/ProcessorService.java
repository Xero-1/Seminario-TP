package linux4.life.Final.Services;

import linux4.life.Final.Mappers.ProcessorMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProcessorService
{
    @Autowired
    private ProcessorService processorService;
    @Autowired
    private ProcessorMapper processorMapper;
    @Autowired
    private ProductService productService;
}
