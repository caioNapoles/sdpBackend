package soDePassagem.backendDevelopment.service;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import soDePassagem.backendDevelopment.dto.UserDTO;
import soDePassagem.backendDevelopment.entity.UserEntity;
import soDePassagem.backendDevelopment.repository.UserRepository;

import org.slf4j.Logger;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    private static Logger logger = LoggerFactory.getLogger(UserService.class);
    public void receiveAndSaveUser(UserDTO userDTO) {
        logger.info("Initializing the saving process of user " + userDTO.getNomeCompleto() + "...");
        try {
            UserEntity userEntity = new UserEntity();
            userEntity.setEmail(userDTO.getEmail());
            userEntity.setNomeCompleto(userDTO.getNomeCompleto());
            userRepository.save(userEntity);
            logger.info("Saved user successfully under id " + userEntity.getId() + ".");
        } catch (Exception e) {
            logger.info("Could not save user. Error: " + e);
            throw new RuntimeException(e);
        }
    }
}
