package ru.korushov.dual.DTO;

import lombok.Data;

/**
 * @author Vitaly Korushov
 */

@Data
public class SignUpRequest {
    private String email;
    private String username;
    private String password;
}
