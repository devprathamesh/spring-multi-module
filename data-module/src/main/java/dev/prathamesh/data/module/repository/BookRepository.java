package dev.prathamesh.data.module.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.prathamesh.data.module.dto.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}
