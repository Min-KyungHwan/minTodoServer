package com.mkh.todo.api.service.impl;

import com.mkh.todo.api.mapper.TodoMapper;
import com.mkh.todo.api.service.TodoService;
import com.mkh.todo.api.vo.TodoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 할일 리스트 서비스 구현 클래스
 */
@Service
public class TodoServiceImpl implements TodoService {

    /**
     * 일과 Mapper
     */
    @Autowired
    private TodoMapper todoMapper;

    @Override
    public List<TodoVO> getTodo(TodoVO param) throws Exception {
        List<TodoVO> resultList = todoMapper.getTodo(param);
        return resultList;
    }

    @Override
    public int addTodo(TodoVO param) throws Exception {
        int cnt = todoMapper.addTodo(param);
        return cnt;
    }

    @Override
    public int delTodo(TodoVO param) throws Exception {
        int cnt = todoMapper.delTodo(param);
        return cnt;
    }
}
