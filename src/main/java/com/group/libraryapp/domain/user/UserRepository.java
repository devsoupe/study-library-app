package com.group.libraryapp.domain.user;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByName(String name);

    boolean existsByName(String name);

    long countByAge(Integer age);

    List<User> findAllByNameAndAge(String name, int age);

    // SELECT * FROM user WHERE age BETWEEN ? AND ?;
    List<User> findAllByAgeBetween(int startAge, int endAge);
}
