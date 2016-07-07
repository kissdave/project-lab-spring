package hu.bme.simonyi.dave.projectlabspring.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by dkiss on 2016. 03. 12..
 */
@Entity
public class Member implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @OneToMany(mappedBy = "member", cascade = {CascadeType.MERGE}, fetch = FetchType.LAZY)
    private List<Disposition> dispositionList;


    public Member() {
    }
}
