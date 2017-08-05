package pl.thewalkingcode.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.thewalkingcode.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
