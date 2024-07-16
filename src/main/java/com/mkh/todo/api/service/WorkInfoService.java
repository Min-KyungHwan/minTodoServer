package com.mkh.todo.api.service;

import com.mkh.todo.api.vo.WorkInfoVO;

/**
 * 일과 상세 서비스 인터페이스
 */

public interface WorkInfoService {
    WorkInfoVO getWorkInfo(WorkInfoVO param) throws Exception;
    
    int setWorkInfo(WorkInfoVO param) throws Exception;

    int addWorkInfo(WorkInfoVO param) throws Exception;
}
