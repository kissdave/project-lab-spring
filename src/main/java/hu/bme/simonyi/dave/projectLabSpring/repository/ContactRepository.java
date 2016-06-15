package hu.bme.simonyi.dave.projectLabSpring.repository;

import hu.bme.simonyi.dave.projectLabSpring.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by dkiss on 2016. 03. 13..
 */
public interface ContactRepository extends JpaRepository<Contact, Integer> {
}
