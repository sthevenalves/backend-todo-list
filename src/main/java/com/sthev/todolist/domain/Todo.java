package com.sthev.todolist.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "Todo")
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "field cannot be null or empty")
    private String name;

    @NotBlank(message = "field cannot be null or empty")
    private String description;

    @NotNull(message = "field cannot be null")
    private Boolean done;

    @NotNull(message = "field cannot be null")
    private Integer priority;

    public Todo() {
    }

    public Todo(Long id, String name, String description, Boolean done, int priority) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.done = done;
        this.priority = priority;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getDone() {
        return done;
    }

    public void setDone(Boolean done) {
        this.done = done;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
}
