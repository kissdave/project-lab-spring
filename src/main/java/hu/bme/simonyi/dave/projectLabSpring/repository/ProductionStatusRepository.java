package hu.bme.simonyi.dave.projectlabspring.repository;

import hu.bme.simonyi.dave.projectlabspring.model.ProductionStatus;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by dkiss on 2016. 03. 13..
 */
public interface ProductionStatusRepository extends JpaRepository<ProductionStatus, Integer> {
}
