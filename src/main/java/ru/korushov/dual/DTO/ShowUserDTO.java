package ru.korushov.dual.DTO;

import lombok.Data;
import ru.korushov.dual.model.Message;

import java.util.List;

/**
 * @author Vitaly Korushov
 */

@Data
public class ShowUserDTO {
    private int userId;
    private String email;
    private String username;
    private String profileSummary;
    private List<Message> messageList;
}
