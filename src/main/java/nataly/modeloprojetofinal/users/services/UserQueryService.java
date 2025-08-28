package nataly.modeloprojetofinal.users.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import nataly.modeloprojetofinal.users.dto.UserResponseDTO;
import nataly.modeloprojetofinal.users.repositories.UserRepository;
import nataly.modeloprojetofinal.users.services.UserMapper.UserMapper;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserQueryService {
    private final UserRepository userRepository;

    public List<UserResponseDTO> findAll() {
        return userRepository.findAll()
                .stream()
                .map(UserMapper::toResponseDTO)
                .toList();
    }

    public List<UserResponseDTO> findAllByUsername(String name) {
        return userRepository.findByNameLikeIgnoreCase(name)
                .stream()
                .map(UserMapper::toResponseDTO)
                .toList();
    }

    public List<UserResponseDTO> findAllByEmail(String email) {
        return userRepository.findByEmailLikeIgnoreCase(email)
                .stream()
                .map(UserMapper::toResponseDTO)
                .toList();
    }
}
