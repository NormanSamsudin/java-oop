package com.example.basiccrud.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.basiccrud.model.Book;

@Repository
public interface BookRepo extends JpaRepository<Book,Long>{
    
}
