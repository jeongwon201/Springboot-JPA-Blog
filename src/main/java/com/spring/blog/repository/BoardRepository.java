package com.spring.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.blog.model.Board;

public interface BoardRepository extends JpaRepository<Board, Integer>{
	
}
