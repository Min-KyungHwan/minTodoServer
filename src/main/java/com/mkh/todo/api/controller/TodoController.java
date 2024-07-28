package com.mkh.todo.api.controller;

import com.mkh.todo.api.service.TodoService;
import com.mkh.todo.api.vo.TodoVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/todo")
public class TodoController {
    private static final Logger logger = LoggerFactory.getLogger(TodoController.class);

    @Autowired
    private TodoService todoService;

    @RequestMapping(value="/getWorkTodo", produces = "application/json", method= RequestMethod.GET)
    public List<TodoVO> getTodo() throws Exception{
        TodoVO param = new TodoVO();
        return todoService.getTodo(param);
    }

    @RequestMapping(value="/addTodo", consumes = "application/json", produces = "application/json", method= RequestMethod.POST)
    public ResponseEntity<String> addTodo(@RequestBody TodoVO todoVO) {
        try {
            todoService.addTodo(todoVO);
            return new ResponseEntity<>("Todo add successfully", HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>("Failed to add todo", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(value="/delTodo", consumes = "application/json", produces = "application/json", method= RequestMethod.POST)
    public ResponseEntity<String> delTodo(@RequestBody TodoVO todoVO) {
        try {
            todoService.delTodo(todoVO);
            return new ResponseEntity<>("Todo del successfully", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("Failed to del todo", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(value="/setTodo", consumes = "application/json", produces = "application/json", method= RequestMethod.POST)
    public ResponseEntity<String> setTodo(@RequestBody TodoVO todoVO) {
        try {
            todoService.setTodo(todoVO);
            return new ResponseEntity<>("Todo set successfully", HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>("Failed to set todo", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
