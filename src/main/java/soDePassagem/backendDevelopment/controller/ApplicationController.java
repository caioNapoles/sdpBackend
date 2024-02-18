package soDePassagem.backendDevelopment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import soDePassagem.backendDevelopment.dto.UserDTO;
import soDePassagem.backendDevelopment.service.UserService;

@Controller
@RestController
public class ApplicationController {
    @Autowired
    UserService userService;
    @PostMapping("/database/newUser")
    private ResponseEntity<UserDTO> sendNewUserToDatabase(@RequestBody UserDTO userDTO) {
        userService.receiveAndSaveUser(userDTO);
        return new ResponseEntity<>(userDTO, HttpStatus.OK);
    }
}
