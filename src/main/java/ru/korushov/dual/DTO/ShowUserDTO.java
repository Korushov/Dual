package ru.korushov.dual.DTO;

import lombok.Data;

/**
 * @author Vitaly Korushov
 */

@Data
public class ShowUserDTO {
    private int userId;
    private String email;
    private String username;
    private String profileSummary;
}
