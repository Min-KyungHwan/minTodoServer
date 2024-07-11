package com.mkh.todo.api.service;

import com.mkh.todo.api.vo.WorkTodoVO;

/**
 * 할일 리스트 서비스 인터페이스
 */

public interface WorkTodoService {
    WorkTodoVO getWorkTodo(WorkTodoVO param) throws Exception;
}
