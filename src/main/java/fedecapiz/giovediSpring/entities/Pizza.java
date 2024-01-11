package fedecapiz.giovediSpring.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Pizza")
@Data

public class Pizza {
   @Id
   @GeneratedValue
   private long id;
   private String name;
   private double price;
   @OneToMany
   @JoinColumn(name = "pizza_id")
   private Set<Ingrediente> ingredienti = new HashSet<>();
    public Pizza(String name, double price) {
        this.name = name;
        this.price = price;
    }

}

