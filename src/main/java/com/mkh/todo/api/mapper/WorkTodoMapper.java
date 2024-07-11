package com.mkh.todo.api.mapper;

import com.mkh.todo.api.vo.WorkTodoVO;

public interface WorkTodoMapper {
    WorkTodoVO getWorkTodo(WorkTodoVO param);
    
    int setWorkTodo(WorkTodoVO param);
    
    int addWorkTodo(WorkTodoVO param);
}
