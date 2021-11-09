package ltillma4.pwbackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void ObfuscatePassword(User user) {
        String obfuscatedPassword = user.getPassword().substring(0, 2);
        user.setPassword(obfuscatedPassword);
    }

    public void logUser(User user) {

        ObfuscatePassword(user);

        String sql = "INSERT INTO users (username, password) VALUES (?, ?)";
        int result = jdbcTemplate.update(sql, user.getUsername(), user.getPassword());

        if (result > 0) {
            System.out.println("A new row has been inserted.");
        }
    }

}
