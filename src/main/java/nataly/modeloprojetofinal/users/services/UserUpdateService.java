package nataly.modeloprojetofinal.users.services;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import nataly.modeloprojetofinal.users.entities.User;
import nataly.modeloprojetofinal.users.repositories.UserRepository;
import org.springframework.stereotype.Service;
import nataly.modeloprojetofinal.users.dto.UserUpdateEmailDTO;
import nataly.modeloprojetofinal.users.dto.UserUpdateNameDTO;

@Service
@RequiredArgsConstructor
public class UserUpdateService {

    private final UserRepository userRepository;

    public void updateEmail(Long id, UserUpdateEmailDTO dto) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("User not found"));
        user.setEmail(dto.email());
        userRepository.save(user);
    }

    public void updateName(Long id, UserUpdateNameDTO dto) {
        User user = userRepository.findById(id)
                .orElseThrow(()-> new EntityNotFoundException("User not found"));
        user.setName(dto.name());
        userRepository.save(user);
    }
}
