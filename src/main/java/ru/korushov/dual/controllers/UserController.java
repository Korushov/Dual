package ru.korushov.dual.controllers;

import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.*;
import ru.korushov.dual.DTO.ShowUserDTO;
import ru.korushov.dual.service.UserService;
import ru.korushov.dual.util.UserConvertor;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Vitaly Korushov
 */

@RestController
@AllArgsConstructor
public class UserController {

    private final UserService userService;
    private final ModelMapper modelMapper;

    @GetMapping("/users")
    public List<ShowUserDTO> showAllUsers() {
        return userService.findAllUsers()
                .stream()
                .map(UserConvertor::convertToDto)
                .collect(Collectors.toList());
    }

    @GetMapping("/users/{userId}")
    public ShowUserDTO  showUserById(@PathVariable int id) {
        if (userService.findUserById(id) != null) {
            return modelMapper.map(userService.findUserById(id), ShowUserDTO.class);
        } else {
            return null;
        }
    }
}
