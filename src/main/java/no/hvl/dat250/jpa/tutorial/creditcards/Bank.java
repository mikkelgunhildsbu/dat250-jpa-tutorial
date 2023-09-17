package no.hvl.dat250.jpa.tutorial.creditcards;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

@Getter
@Entity
@Setter
public class Bank {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "owningBank")
    private Collection<CreditCard> ownedCards;


    public Collection<CreditCard> getOwnedCards(){
        if (ownedCards == null) {
            ownedCards = new HashSet<>();
        }
        return new HashSet<>(ownedCards);
    }


}