package ru.korushov.dual.controllers;

import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ru.korushov.dual.DTO.MessageDTO;
import ru.korushov.dual.model.Message;
import ru.korushov.dual.service.MessageService;

import java.util.List;
import java.util.Optional;

/**
 * @author Vitaly Korushov
 */

@RestController
@AllArgsConstructor
public class MessageController {

    private final MessageService messageService;
    private final ModelMapper modelMapper;

    @GetMapping("/messages")
    public List<Message> showAllMessages() {
        return messageService.findAllMessages();
    }

    @GetMapping("/messages/{messageId}")
    public Optional<Message> showMessageById(@PathVariable int id) {
        return messageService.findMessageById(id);
    }

    @PostMapping("messages/new")
    public HttpStatus addNewMessage(@RequestBody MessageDTO messageDTO) {
        messageService.saveMessage(messageDTO);
        return HttpStatus.OK;
    }
}
