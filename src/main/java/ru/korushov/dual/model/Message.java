package ru.korushov.dual.model;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.OffsetTime;

/**
 * @author Vitaly Korushov
 */

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "message")
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mess_id")
    private int messId;

    @Column(name = "user_id")
    private int userId;

    @Column(name = "message")
    @NotNull
    @Size(max = 400)
    private String text;

    @Column(name = "offset_time", columnDefinition = "TIME WITH TIME ZONE")
    private OffsetTime offsetTime;

    @Column(name = "local_date", columnDefinition = "DATE")
    private LocalDate localDate;

    public Message(int userId, String text) {
        this.userId = userId;
        this.text = text;
    }

    //private int likesCount;
}
