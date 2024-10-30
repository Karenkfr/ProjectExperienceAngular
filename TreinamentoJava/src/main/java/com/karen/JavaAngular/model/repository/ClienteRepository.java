package com.karen.JavaAngular.model.repository;

import com.karen.JavaAngular.model.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
