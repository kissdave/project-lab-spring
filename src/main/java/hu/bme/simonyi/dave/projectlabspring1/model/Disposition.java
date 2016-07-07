package hu.bme.simonyi.dave.projectlabspring.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by dkiss on 2016. 03. 12..
 */
@Entity
public class Disposition implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @ManyToOne
    private Post post;

    @ManyToOne
    private Member member;

    @ManyToOne
    private Production production;

    private Date dispositionTime;

    private String dispositionVenue;

    public Disposition() {
        // Blank constructor for Hibernate
    }

    // --- Getters ---

    public Integer getId() {
        return id;
    }

    public Post getPost() {
        return post;
    }

    public Member getMember() {
        return member;
    }

    public Production getProduction() {
        return production;
    }

    public Date getDispositionTime() {
        return dispositionTime;
    }

    public String getDispositionVenue() {
        return dispositionVenue;
    }
}
