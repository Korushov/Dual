package ru.korushov.dual.service;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.korushov.dual.DTO.MessageDTO;
import ru.korushov.dual.model.Message;
import ru.korushov.dual.repo.MessageRepo;

import java.time.LocalDate;
import java.time.OffsetTime;
import java.util.List;

/**
 * @author Vitaly Korushov
 */

@Service
@AllArgsConstructor
public class MessageService {

    private final MessageRepo messageRepo;

    public List<Message> findAllMessages() {
        List<Message> messages = messageRepo.findAll();
        return messages;
    }

}
