package com.example.login_practice.dto;

import com.example.login_practice.entity.RegisterEntity;
import jakarta.persistence.Column;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class RegisterDTO {
    private Long id;
    private String name;
    private String username;
    private String password;
    private String phone;
    private String nickname;
}


