package com.mkh.todo.api.service;

import com.mkh.todo.api.vo.TodoVO;

import java.util.List;

/**
 * 할일 리스트 서비스 인터페이스
 */

public interface TodoService {
    List<TodoVO> getTodo(TodoVO param) throws Exception;

    int addTodo(TodoVO param) throws Exception;

    int delTodo(TodoVO param) throws Exception;
}
