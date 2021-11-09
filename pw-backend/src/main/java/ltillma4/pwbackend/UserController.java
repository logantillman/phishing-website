package ltillma4.pwbackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(method= RequestMethod.POST, value="/login")
    public void logUser(@RequestBody User user) {
        userService.logUser(user);
    }
}
