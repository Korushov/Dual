package ru.korushov.dual.controllers;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.korushov.dual.DTO.SignUpRequest;
import ru.korushov.dual.entity.User;
import ru.korushov.dual.service.UserService;

import java.util.List;

/**
 * @author Vitaly Korushov
 */

@RestController
@AllArgsConstructor
public class RegisterController {
    private final UserService userService;

    @PostMapping("/register")
    public HttpStatus register(@RequestBody SignUpRequest signUpRequest) {
        List<String> emails = userService.findAllEmails();
        String currEmail = signUpRequest.getEmail();
        for (String email : emails) {
            if (currEmail.equals(email)) {
                throw new BadCredentialsException("Email is already taken");
            }
        }

        userService.addNewUser(new User(signUpRequest.getEmail(), signUpRequest.getUsername(), signUpRequest.getPassword()));
        return HttpStatus.OK;
    }
}
