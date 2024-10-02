package org.example.qtalk.Controller;

import lombok.RequiredArgsConstructor;
import org.example.qtalk.Service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping("/save")
    public String saveUser() {
        String userName = "박찬민";
        String userPassword = "1234";
        String userPhone = "01010101";


        userService.signin(userName, userPassword, userPhone);
        return "ok";
    }

}
