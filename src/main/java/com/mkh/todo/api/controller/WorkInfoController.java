package com.mkh.todo.api.controller;

import com.mkh.todo.api.service.WorkInfoService;
import com.mkh.todo.api.vo.WorkInfoVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/workInfo")
public class WorkInfoController {
    private static final Logger logger = LoggerFactory.getLogger(WorkInfoController.class);

    @Autowired
    private WorkInfoService workInfoService;

    @RequestMapping(value="/getWorkInfo", produces = "application/json", method= RequestMethod.GET)
    public WorkInfoVO getWorkInfo() throws Exception{
//        return "Hello, Spring!";
        return workInfoService.getWorkInfo();
    }
}
