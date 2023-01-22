package ru.korushov.dual.DTO;

import lombok.Data;

/**
 * @author Vitaly Korushov
 */

@Data
public class MessageDTO {
    private int userId;
    private String text;
}