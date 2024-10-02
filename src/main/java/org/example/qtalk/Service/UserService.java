package org.example.qtalk.Service;

import org.example.qtalk.Entity.UserEntity;
import org.example.qtalk.Repository.UsersRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UsersRepository userRepository;

    public UserService(UsersRepository userRepository) {
        this.userRepository = userRepository;
    }

    public String signin(String userName, String userPassword, String userPhone) {
        UserEntity userEntity = new UserEntity();
        int a = 1;
        userEntity.setId(a);
        userEntity.setName(userName);
        userEntity.setPassword(userPassword);
        userEntity.setPhone(userPhone);
        userRepository.save(userEntity);
        String response = "ok";
        return response;
    }
}
