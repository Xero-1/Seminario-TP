package linux4.life.Final.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Table(name="motherboard")
@Entity
@Getter
@Setter
public class Motherboard
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private long id;
    @OneToOne
    private Product product;
    private String socket;
    @OneToMany
    private List<Processor> processors_supported;
}
