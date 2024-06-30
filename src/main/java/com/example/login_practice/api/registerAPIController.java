package com.example.login_practice.api;

import com.example.login_practice.controller.LoginController;
import com.example.login_practice.entity.RegisterEntity;
import com.example.login_practice.repository.RegisterRepository;
import com.example.login_practice.service.Register_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class registerAPIController {
    @Autowired
    private RegisterRepository registerrepository;
    @Autowired
    private Register_Service registerService;

    @PostMapping("/register")
    public ResponseEntity<?> registerUser(@RequestBody RegisterEntity user) {
        if (registerService.isUsernameTaken(user.getUsername())) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new registerAPIController.MessageResponse("중복된 아이디가 있습니다."));
        } else {
            registerService.registerUser(user);
            return ResponseEntity.status(HttpStatus.OK).body(new registerAPIController.MessageResponse("회원가입이 완료되었습니다."));
        }
    }

    public static class MessageResponse {
        private String message;

        public MessageResponse(String message) {
            this.message = message;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }
    }
}
