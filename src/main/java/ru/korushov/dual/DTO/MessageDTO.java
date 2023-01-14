package ru.korushov.dual.DTO;

import lombok.Data;

import java.time.LocalDate;
import java.time.OffsetTime;

/**
 * @author Vitaly Korushov
 */

@Data
public class MessageDTO {
    private int userId;
    private String message;
    private OffsetTime offsetTime;
    private LocalDate localDate;
}
