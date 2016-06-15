package hu.bme.simonyi.dave.projectLabSpring.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by dkiss on 2016. 03. 12..
 */
@Entity
public class Production implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @NotNull
    private String name;

    @NotNull
    private Date startTime;

    @NotNull
    private Date endTime;

    private String venue;

    private String description;

    private String techDescription;

    private Boolean needPermission;

    private Boolean gotPermission;

    private Boolean isHD;

    private Integer cameraNumber;

    /* Here the connections comes */
    @ManyToOne
    private Customer customer;

    @ManyToOne
    private Contact contact;

    @ManyToOne
    private ProductionStatus productionStatus;

    @OneToMany(mappedBy = "production", cascade = {CascadeType.MERGE}, fetch = FetchType.LAZY)
    private List<Disposition> dispositionList;


    public Production() {
    }
}
