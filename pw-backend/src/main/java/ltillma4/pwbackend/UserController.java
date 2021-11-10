package ltillma4.pwbackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping(method= RequestMethod.POST, value="/login")
    public void logUser(@RequestBody User user) {
        userService.logUser(user);
    }
}
