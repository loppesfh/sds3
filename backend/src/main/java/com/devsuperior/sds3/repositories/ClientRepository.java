package com.devsuperior.sds3.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.sds3.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{

}
