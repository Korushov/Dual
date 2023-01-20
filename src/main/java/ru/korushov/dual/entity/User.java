package ru.korushov.dual.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

import javax.annotation.processing.Generated;
import javax.persistence.*;
import java.util.List;

/**
 * @author Vitaly Korushov
 */

@Entity
@Table(name = "user")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @Generated(value = "")
    @Column(name = "user_id")
    private int userId;

    @Column(name = "email")
    @Email
    @NotNull
    private String email;

    @Column(name = "username")
    @NotNull
    private String username;

    @Column(name = "password")
    @NotNull
    private String password;

    @Column(name = "profile_summary")
    @Size(max = 160)
    private String profileSummary;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private List<Message> messageList;

    public User(String email, String username, String password) {
        this.email = email;
        this.username = username;
        this.password = password;
    }
}
