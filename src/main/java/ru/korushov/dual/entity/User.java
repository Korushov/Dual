package ru.korushov.dual.entity;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

import javax.annotation.processing.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;

/**
 * @author Vitaly Korushov
 */

@Entity
@Table(name = "users")
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


    public User(String email, String username, String password) {
        this.email = email;
        this.username = username;
        this.password = password;
    }
}
