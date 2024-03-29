package com.devsuperior.sds3.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.sds3.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{

}
