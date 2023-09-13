package no.hvl.dat250.jpa.tutorial.creditcards;

import java.util.ArrayList;
import java.util.Collection;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Getter
    private String name;

    @Getter
    @ManyToMany
    private Collection<CreditCard> creditCards = new ArrayList<>();

    @Getter
    @ManyToMany
    private Collection<Address> addresses = new ArrayList<>();


}