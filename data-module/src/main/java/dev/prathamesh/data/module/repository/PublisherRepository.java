package dev.prathamesh.data.module.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.prathamesh.data.module.dto.Publisher;

public interface PublisherRepository extends JpaRepository<Publisher, Long> {

}
