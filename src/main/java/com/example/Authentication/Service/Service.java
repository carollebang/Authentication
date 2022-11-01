package com.example.Authentication.Service;

import com.example.Authentication.DTO.UserDTO;
import com.example.Authentication.Repo.UserRepo;
import com.example.Authentication.Tables.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class Service {

    @Autowired//no need for creating objects with "new"
    UserRepo UserRepository;
    @PostMapping("/createruser")//saving the data (services)
    public ResponseEntity<?> createrUser(@RequestBody UserDTO user) {//body for jason must be exactly like the date in the user table
        var Users = new User();
        Users.setNames(user.getUsername());
        Users.setPassword(user.getPassword());

        var SaveData  = UserRepository.save(Users);
        return ResponseEntity.ok(SaveData);
    }
    @PostMapping("/resetPassword")
    public ResponseEntity<?>  resetPassword(@RequestBody UserDTO user) {
        var userInfo = UserRepository.findById(user.getUsername());
        if (userInfo.isPresent()) {
            var U = userInfo.get();
            U.setPassword(user.getPassword());
            return ResponseEntity.ok(UserRepository.save(U));
        }

        return ResponseEntity.badRequest().body("user not found");
    }
}
