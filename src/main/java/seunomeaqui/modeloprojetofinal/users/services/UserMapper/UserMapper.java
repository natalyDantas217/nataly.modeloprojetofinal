package seunomeaqui.modeloprojetofinal.users.services.UserMapper;

import seunomeaqui.modeloprojetofinal.users.dto.UserCreateDTO;
import seunomeaqui.modeloprojetofinal.users.dto.UserResponseDTO;
import seunomeaqui.modeloprojetofinal.users.entities.User;

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
