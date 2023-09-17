package no.hvl.dat250.jpa.tutorial.creditcards;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;


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


    public Collection<Customer> getOwners(){
        if (customers == null) {
            customers = new HashSet<>();
        }
        return new HashSet<>(customers);
    }


    @Getter
    @ManyToMany(mappedBy = "addresses")
    private Collection<Customer> customers;



}