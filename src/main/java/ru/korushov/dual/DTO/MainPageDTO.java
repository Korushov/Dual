package ru.korushov.dual.DTO;

import lombok.AllArgsConstructor;
import ru.korushov.dual.model.Message;

import java.util.List;

/**
 * @author Vitaly Korushov
 */

@AllArgsConstructor
public class MainPageDTO {
    List<Message> messages;
}
