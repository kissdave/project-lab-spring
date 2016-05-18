package hu.bme.simonyi.dave.projectLabSpring.repository;

import hu.bme.simonyi.dave.projectLabSpring.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by dkiss on 2016. 05. 04..
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
