package com.mkh.todo.api.service.impl;

import com.mkh.todo.api.mapper.WorkTodoMapper;
import com.mkh.todo.api.service.WorkTodoService;
import com.mkh.todo.api.vo.WorkTodoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 할일 리스트 서비스 구현 클래스
 */
@Service
public class WorkTodoServiceImpl implements WorkTodoService {

    /**
     * 일과 Mapper
     */
    @Autowired
    private WorkTodoMapper workTodoMapper;
    
    @Override
    public WorkTodoVO getWorkTodo(WorkTodoVO param) throws Exception {
        WorkTodoVO resultVO = workTodoMapper.getWorkTodo(param);
        return resultVO;
    }
}
