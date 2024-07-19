package com.example.demo.REPOSITORY;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.ENTITY.BookEntity;

@Repository
public interface BookRepository extends JpaRepository<BookEntity,Integer> {

}
