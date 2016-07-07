package hu.bme.simonyi.dave.projectlabspring.repository;

import hu.bme.simonyi.dave.projectlabspring.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by dkiss on 2016. 03. 13..
 */
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
