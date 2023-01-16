package ru.korushov.dual.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.korushov.dual.DTO.MessageDTO;
import ru.korushov.dual.model.Message;
import ru.korushov.dual.repo.MessageRepo;

import java.time.LocalDate;
import java.time.OffsetTime;
import java.util.List;
import java.util.Optional;

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

    public void saveMessage(MessageDTO messageDTO) {
        Message message = new Message(messageDTO.getUserId(), messageDTO.getText());
        message.setLocalDate(LocalDate.now());
        message.setOffsetTime(OffsetTime.now());
        messageRepo.save(message);
    }

    public Optional<Message> findMessageById(int id) {
        return messageRepo.findById(Long.valueOf(id));
    }
}
