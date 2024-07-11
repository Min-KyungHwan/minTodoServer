package com.mkh.todo.api.mapper;

import com.mkh.todo.api.vo.UserVO;

public interface UserMapper {
    UserVO getUser(UserVO param);
    
    int setUser(UserVO param);
    
    int addUser(UserVO param);
}
