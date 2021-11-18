package ltillma4.pwbackend;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    @Modifying
    @Query(value = "INSERT INTO users (username, password) VALUES (:username, :password)", nativeQuery = true)
    public void logUser(@Param("username") String username, @Param("password") String password);
}
