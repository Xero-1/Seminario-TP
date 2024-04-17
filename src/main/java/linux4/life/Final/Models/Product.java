package linux4.life.Final.Models;


import javax.persistence.*;

import lombok.*;

@Table(name="product")
@Entity
@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
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
