package pl.thewalkingcode.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.thewalkingcode.model.User;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    User findFirstByLogin(String login);

}
