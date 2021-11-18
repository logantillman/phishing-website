package ltillma4.pwbackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    public void ObfuscatePassword(User user) {
        String obfuscatedPassword = user.getPassword().substring(0, 2);
        user.setPassword(obfuscatedPassword);
    }

    @Transactional
    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping(method= RequestMethod.POST, value="/login")
    public void logUser(@RequestBody User user) {
        ObfuscatePassword(user);
        System.out.println(user.getUsername());
        System.out.println(user.getPassword());
        userRepository.logUser(user.getUsername(), user.getPassword());
    }
}
