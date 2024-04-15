package linux4.life.Final.Models;

import lombok.Getter;
import lombok.Builder;

import javax.persistence.*;

@Table(name="processor")
@Entity
@Getter
@Builder
public class Processor
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private Long id;
    @OneToOne
    private Product product;
    private String model;
    private boolean has_apu;
    private int nr_cores;
    private int nr_threads;

}
