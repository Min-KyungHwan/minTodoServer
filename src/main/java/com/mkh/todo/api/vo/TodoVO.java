package com.mkh.todo.api.vo;

import lombok.Data;

@Data
public class TodoVO {
    private String workTodoSeq;

    private String userSeq;

    private String sortNo;

    private String todoNm;

    private Boolean status;

    private String modDt;

    private String modId;

    private String regDt;

    private String regId;
}
