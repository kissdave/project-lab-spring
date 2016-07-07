package hu.bme.simonyi.dave.projectlabspring.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;

/**
 * Created by dkiss on 2016. 03. 12..
 */
@Entity
public class Contact implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @NotNull
    private String fullName;

    private String nickname;

    @NotNull
    private String email;

    private String mobile;

    @ManyToMany(mappedBy = "contacts")
    private List<Customer> customers;

    @OneToMany(mappedBy = "contact", cascade = {CascadeType.MERGE}, fetch = FetchType.LAZY)
    private List<Production> productions;


    public Contact() {
        // Blank constructor for Hibernate
    }


    // --- Getters ---
    public Integer getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getNickname() {
        return nickname;
    }

    public String getEmail() {
        return email;
    }

    public String getMobile() {
        return mobile;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public List<Production> getProductions() {
        return productions;
    }
}
