package com.mkh.todo.api.mapper;

import com.mkh.todo.api.vo.WorkInfoVO;

public interface WorkInfoMapper {
    WorkInfoVO getWorkInfo(WorkInfoVO param);
    
    int setWorkInfo(WorkInfoVO param);

    int addWorkInfo(WorkInfoVO param);
}
