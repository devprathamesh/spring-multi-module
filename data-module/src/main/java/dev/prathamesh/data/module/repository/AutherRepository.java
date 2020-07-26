package dev.prathamesh.data.module.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.prathamesh.data.module.dto.Auther;

public interface AutherRepository extends JpaRepository<Auther, Long> {

}
