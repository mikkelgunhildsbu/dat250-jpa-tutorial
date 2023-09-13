package no.hvl.dat250.jpa.tutorial.creditcards;

import java.util.ArrayList;
import java.util.Collection;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Getter
    private String street;
    @Getter
    private Integer number;

    @Getter
    @ManyToMany(mappedBy = "addresses")
    private Collection<Customer> owners = new ArrayList<>();


}