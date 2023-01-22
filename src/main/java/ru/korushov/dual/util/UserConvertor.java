package ru.korushov.dual.util;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import ru.korushov.dual.DTO.ShowUserDTO;
import ru.korushov.dual.entity.User;

/**
 * @author Vitaly Korushov
 */
@Component
@AllArgsConstructor
public class UserConvertor {
    private static final ModelMapper modelMapper = null;


public static ShowUserDTO convertToDto(User user){
        return modelMapper.map(user, ShowUserDTO.class);
    }
}
