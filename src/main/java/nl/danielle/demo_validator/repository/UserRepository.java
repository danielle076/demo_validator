package nl.danielle.demo_validator.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import nl.danielle.demo_validator.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
