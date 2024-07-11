package com.mkh.todo.api.controller;

import com.mkh.todo.api.service.WorkTodoService;
import com.mkh.todo.api.vo.WorkTodoVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/workTodo")
public class WorkTodoController {
    private static final Logger logger = LoggerFactory.getLogger(WorkTodoController.class);
    
    @Autowired
    private WorkTodoService workTodoService;
    
    @RequestMapping(value="/getWorkTodo", produces = "application/json", method= RequestMethod.GET)
    public WorkTodoVO getWorkTodo() throws Exception{
        WorkTodoVO param = new WorkTodoVO();
        return workTodoService.getWorkTodo(param);
    }
}
