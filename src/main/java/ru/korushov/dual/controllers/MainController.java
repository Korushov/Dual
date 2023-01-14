package ru.korushov.dual.controllers;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.korushov.dual.DTO.MainPageDTO;
import ru.korushov.dual.DTO.MessageDTO;
import ru.korushov.dual.service.MessageService;
import ru.korushov.dual.service.UserService;

/**
 * @author Vitaly Korushov
 */

@RestController
@AllArgsConstructor
public class MainController {

    private final UserService userService;
    private final MessageService messageService;

    @GetMapping("/")
    public MainPageDTO showMainPage() {
        return new MainPageDTO(messageService.findAllMessages());
    }

    @PostMapping("/")
    public HttpStatus sendMessage(@RequestBody MessageDTO messageDTO) {
        messageService.saveMessage(messageDTO);
        return HttpStatus.OK;
    }
}
