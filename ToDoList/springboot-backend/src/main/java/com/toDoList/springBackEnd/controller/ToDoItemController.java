package com.toDoList.springBackEnd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.toDoList.springBackEnd.model.ToDoItem;
import com.toDoList.springBackEnd.repository.ToDoItemRepository;

@RestController
@RequestMapping("/api/v1/")
public class ToDoItemController {
	
	@Autowired
	private ToDoItemRepository toDoItemRepository;
	
	// get all items
	@GetMapping("/toDoItems")
	public List<ToDoItem> getAllItems() {
		return toDoItemRepository.findAll();
	}
}
