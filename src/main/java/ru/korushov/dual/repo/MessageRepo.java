package ru.korushov.dual.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.korushov.dual.entity.Message;

/**
 * @author Vitaly Korushov
 */

@Repository
public interface MessageRepo extends JpaRepository<Message, Long> {

}