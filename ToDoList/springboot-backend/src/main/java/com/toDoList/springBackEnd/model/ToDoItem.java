package com.toDoList.springBackEnd.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "toDoItems")
public class ToDoItem {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "description")
	private String description;
	
	
	public int getId() {
		return id;
	}	
	public ToDoItem() {
		super();
	}

	public ToDoItem(int id, String description) {
		super();
		this.id = id;
		this.description = description;
	}

	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}	
}
