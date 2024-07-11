package com.mkh.todo.api.service.impl;

import com.mkh.todo.api.mapper.WorkInfoMapper;
import com.mkh.todo.api.service.WorkInfoService;
import com.mkh.todo.api.vo.WorkInfoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 일과 상세 서비스 구현 클래스
 */
@Service
public class WorkInfoServiceImpl implements WorkInfoService {
    
    /**
     * 일과 상세 Mapper
     */
    @Autowired
    private WorkInfoMapper workInfoMapper; 
    
    @Override
    public WorkInfoVO getWorkInfo(WorkInfoVO param) throws  Exception {
        WorkInfoVO resultVO = workInfoMapper.getWorkInfo(param);
//        String result = resultVo.getWorkInfo();
        return resultVO;
    }
}
