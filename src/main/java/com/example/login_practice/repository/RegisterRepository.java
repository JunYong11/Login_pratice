package com.example.login_practice.repository;

import com.example.login_practice.entity.RegisterEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface RegisterRepository extends CrudRepository<RegisterEntity,String> {

    Optional<Object> findByUsername(String username);
}
