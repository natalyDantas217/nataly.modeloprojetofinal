package seunomeaqui.modeloprojetofinal.users.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import seunomeaqui.modeloprojetofinal.users.dto.UserCreateDTO;
import seunomeaqui.modeloprojetofinal.users.dto.UserResponseDTO;
import seunomeaqui.modeloprojetofinal.users.entities.User;
import seunomeaqui.modeloprojetofinal.users.repositories.UserRepository;
import seunomeaqui.modeloprojetofinal.users.services.UserMapper.UserMapper;

@Service
@RequiredArgsConstructor
public class UserCreateService {

    private final UserRepository userRepository;

    public UserResponseDTO createUser(UserCreateDTO dto) {
        User user = UserMapper.toEntity(dto);
        return UserMapper.toResponseDTO(userRepository.save(user));
    }
}
