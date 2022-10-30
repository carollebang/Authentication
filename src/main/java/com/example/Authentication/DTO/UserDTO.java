package com.example.Authentication.DTO;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor

public class UserDTO implements Serializable {
    private  String  username;
    private Integer password;

}
