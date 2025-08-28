package nataly.modeloprojetofinal.users.services.UserMapper;

import nataly.modeloprojetofinal.users.dto.UserCreateDTO;
import nataly.modeloprojetofinal.users.dto.UserResponseDTO;
import nataly.modeloprojetofinal.users.entities.User;

public class UserMapper {

    public static User toEntity(UserCreateDTO dto) {
        return new User(
                dto.name(),
                dto.email()
        );
    }

    public static UserResponseDTO toResponseDTO(User user) {
        return new UserResponseDTO(
                user.getId(),
                user.getName(),
                user.getEmail()
        );
    }
}
