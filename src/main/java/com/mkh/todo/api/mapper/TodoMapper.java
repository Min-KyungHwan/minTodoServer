package com.mkh.todo.api.mapper;

import com.mkh.todo.api.vo.TodoVO;

import java.util.List;

public interface TodoMapper {
    List<TodoVO> getTodo(TodoVO param);

    int setWorkTodo(TodoVO param);

    int addTodo(TodoVO param);

    int delTodo(TodoVO param);
}
