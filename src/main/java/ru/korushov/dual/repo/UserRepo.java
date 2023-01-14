package ru.korushov.dual.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.korushov.dual.model.User;

import java.util.List;

/**
 * @author Vitaly Korushov
 */

@Repository
public interface UserRepo extends JpaRepository<User, Long> {
    User findByEmail(String email);

    List<User> findAll();
}


