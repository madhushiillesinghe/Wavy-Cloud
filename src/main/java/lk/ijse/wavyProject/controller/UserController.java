package lk.ijse.wavyProject.controller;

import lk.ijse.wavyProject.service.WeavyUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/weavy/users")
public class UserController {

    @Autowired
    private WeavyUserService userService;

    @PostMapping
    public String createUser(@RequestBody String userJson) throws Exception {
        return userService.createUser(userJson);
    }
}
