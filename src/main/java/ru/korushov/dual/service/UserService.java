package ru.korushov.dual.service;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import ru.korushov.dual.model.User;
import ru.korushov.dual.repo.UserRepo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Vitaly Korushov
 */
@Service
@AllArgsConstructor
public class UserService {


    private final UserRepo userRepo;
    private final PasswordEncoder passwordEncoder;

    public List<String> findAllEmails() {
        List<User> users = userRepo.findAll();
        List<String> emails = new ArrayList<>();
        for (User user: users) {
            emails.add(user.getEmail());
        }
        return emails;
    }

    public void addNewUser(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepo.save(user);
    }
}
