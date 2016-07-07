package hu.bme.simonyi.dave.projectlabspring.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;

/**
 * Created by dkiss on 2016. 03. 12..
 */
@Entity
public class ProductionStatus implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @NotNull
    private String name;

    @NotNull
    private Integer orderNum;

    @OneToMany(mappedBy = "productionStatus", cascade = {CascadeType.MERGE}, fetch = FetchType.LAZY)
    private List<Production> productionList;

    public ProductionStatus() {
    }
}
