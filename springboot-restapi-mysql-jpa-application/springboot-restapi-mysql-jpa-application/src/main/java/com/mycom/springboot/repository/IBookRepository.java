package com.mycom.springboot.repository;

import org.springframework.data.repository.CrudRepository;
//repository that extends CrudRepository

import com.mycom.springboot.model.Book;

public interface IBookRepository extends CrudRepository<Book, Integer> {
	
}
