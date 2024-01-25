package com.sthev.todolist.servicies;

import com.sthev.todolist.domain.Todo;
import com.sthev.todolist.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class TodoService {
    @Autowired
    private TodoRepository repository;

    public List<Todo> findAll(){
        Sort sort = Sort.by("priority").ascending();
        return repository.findAll(sort);

    }

    public void save(Todo todo){
        repository.save(todo);
    }



    public void replace(Todo todo) {
        Optional<Todo> existingTodo = repository.findById(todo.getId());

        if (existingTodo.isPresent()) {

            Todo savedTodo = existingTodo.get();
            savedTodo.setName(todo.getName());
            savedTodo.setDescription(todo.getDescription());
            savedTodo.setDone(todo.getDone());
            savedTodo.setPriority(todo.getPriority());
            repository.save(savedTodo);

        }else{
            throw new NoSuchElementException("User Not Found: " + todo.getId());
        }
    }


    public void delete(Long id){

        Optional<Todo> existingTodo = repository.findById(id);

        if(existingTodo.isPresent()){

            repository.deleteById(id);

        }else{
            throw new NoSuchElementException("User Not Found: " + id);
        }

    }
}
