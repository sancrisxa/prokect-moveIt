package br.com.moveitapi.moveitapi.repositories;

import br.com.moveitapi.moveitapi.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
