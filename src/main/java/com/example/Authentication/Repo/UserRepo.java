package com.example.Authentication.Repo;

import com.example.Authentication.Tables.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User,String> {//for the springframework to know where to interact with the table


}
