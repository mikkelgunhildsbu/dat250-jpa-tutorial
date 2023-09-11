package no.hvl.dat250.jpa.tutorial.creditcards;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Collection;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class CreditCard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private Integer number;

    private Integer balance;


    private Integer creditLimit;

    @ManyToOne
    private Bank owningBank;


    @ManyToOne
    private Pincode pincode;

    @ManyToMany(mappedBy = "creditCards")
    private Collection<Customer> owners;

}
