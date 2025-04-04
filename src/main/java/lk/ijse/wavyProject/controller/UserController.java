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

    @GetMapping("/{userId}")
    public String getUser(@PathVariable String userId) throws Exception {
        return userService.getUserById(userId);
    }

    @GetMapping
    public String getAllUsers() throws Exception {
        return userService.getAllUsers();
    }

    @PutMapping("/{userId}")
    public String updateUser(@PathVariable String userId, @RequestBody String userJson) throws Exception {
        return userService.updateUser(userId, userJson);
    }

    @DeleteMapping("/{userId}")
    public String deleteUser(@PathVariable String userId) throws Exception {
        return userService.deleteUser(userId);
    }
}
