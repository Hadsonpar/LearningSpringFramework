package com.hadsonpar.crudtestunitspringboot.repository;
import com.hadsonpar.crudtestunitspringboot.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IClientRepository extends JpaRepository<Client, Long> {
}