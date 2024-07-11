package com.mkh.todo.api.vo;

import lombok.Data;

@Data
public class UserVO {
    private String userSeq;
    
    private String userId;
    
    private String userPw;
    
    private String loginFailCnt;
    
    private String lastLoginDt;
    
    private String lastLoginIp;
    
    private String pwModDt;
    
    private String pwStayCnt;
    
    private String lastActDt;
    
    private String useYn;
    
    private String modDt;
    
    private String modId;
    
    private String regDt;
    
    private String regId;
}
