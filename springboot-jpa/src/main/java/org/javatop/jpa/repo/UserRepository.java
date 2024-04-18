package org.javatop.jpa.repo;

import org.javatop.jpa.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author : Leo
 * @version 1.0
 * @date 2024-04-17 21:35
 * @description :
 */
public interface UserRepository extends JpaRepository<User, Integer> {

    List<User> findByName(String name);
}
