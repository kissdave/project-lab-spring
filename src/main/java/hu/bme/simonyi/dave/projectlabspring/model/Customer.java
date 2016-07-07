package hu.bme.simonyi.dave.projectlabspring.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;

/**
 * Created by dkiss on 2016. 03. 12..
 */
@Entity
public class Customer implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @NotNull
    private String name;


    private String accountingName;
    private String accountingAddress;
    private String accountingTaxNumber;

    @ManyToMany
    @JoinTable(
            name="customer_contact",
            joinColumns = @JoinColumn(name="customer_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name="contact_id", referencedColumnName = "id")
    )
    private List<Contact> contacts;


    @OneToMany(mappedBy = "customer", cascade = {CascadeType.MERGE}, fetch = FetchType.LAZY)
    private List<Production> productions;

    public Customer() {
        // Blank constructor for Hibernate
    }

    // --- Getters ---

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAccountingName() {
        return accountingName;
    }

    public String getAccountingAddress() {
        return accountingAddress;
    }

    public String getAccountingTaxNumber() {
        return accountingTaxNumber;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public List<Production> getProductions() {
        return productions;
    }
}
