package fedecapiz.giovediSpring.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
public class Ingrediente {
    @Id
    @GeneratedValue
    private Long id;

    private String nome;
    @ManyToOne
    @JoinColumn(name = "pizza_id")
    private Pizza pizza;
}
