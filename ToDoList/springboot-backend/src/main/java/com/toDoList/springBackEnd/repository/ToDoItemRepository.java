package com.toDoList.springBackEnd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.toDoList.springBackEnd.model.ToDoItem;

@Repository
public interface ToDoItemRepository extends JpaRepository<ToDoItem, Integer>{
	
}
