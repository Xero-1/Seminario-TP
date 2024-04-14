package linux4.life.Final.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Table(name="graphics_card")
@Entity
@Getter
@Setter
public class GraphicsCard
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private Long id;
    @OneToOne
    private Product product;
}
