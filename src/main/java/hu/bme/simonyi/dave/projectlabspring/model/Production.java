package hu.bme.simonyi.dave.projectlabspring.model;

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
        // Blank constructor for Hibernate
    }

    // --- Getters ---

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getStartTime() {
        return startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public String getVenue() {
        return venue;
    }

    public String getDescription() {
        return description;
    }

    public String getTechDescription() {
        return techDescription;
    }

    public Boolean getNeedPermission() {
        return needPermission;
    }

    public Boolean getGotPermission() {
        return gotPermission;
    }

    public Boolean getHD() {
        return isHD;
    }

    public Integer getCameraNumber() {
        return cameraNumber;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Contact getContact() {
        return contact;
    }

    public ProductionStatus getProductionStatus() {
        return productionStatus;
    }

    public List<Disposition> getDispositionList() {
        return dispositionList;
    }
}
