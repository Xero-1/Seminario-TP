package linux4.life.Final.models;

import lombok.Getter;
import lombok.Builder;
import javax.persistence.*;

@Table(name="product")
@Entity
@Getter
@Builder
public class Product
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private Long id;
    private String name;
    private String description;
    private float price;
}
