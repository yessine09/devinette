package tn.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.spring.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {

}
