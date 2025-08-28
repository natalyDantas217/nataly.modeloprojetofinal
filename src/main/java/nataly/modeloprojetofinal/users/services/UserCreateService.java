package nataly.modeloprojetofinal.users.services;

import lombok.RequiredArgsConstructor;
import nataly.modeloprojetofinal.users.dto.UserCreateDTO;
import nataly.modeloprojetofinal.users.entities.User;
import org.springframework.stereotype.Service;
import nataly.modeloprojetofinal.users.dto.UserResponseDTO;
import nataly.modeloprojetofinal.users.repositories.UserRepository;
import nataly.modeloprojetofinal.users.services.UserMapper.UserMapper;

@Service
@RequiredArgsConstructor
public class UserCreateService {

    private final UserRepository userRepository;

    public UserResponseDTO createUser(UserCreateDTO dto) {
        User user = UserMapper.toEntity(dto);
        return UserMapper.toResponseDTO(userRepository.save(user));
    }
}
