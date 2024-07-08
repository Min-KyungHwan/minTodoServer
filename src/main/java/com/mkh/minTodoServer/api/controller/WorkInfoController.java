package com.mkh.minTodoServer.api.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/workInfo")
public class WorkInfoController {
    private static final Logger logger = LoggerFactory.getLogger(WorkInfoController.class);
    
    @RequestMapping(value="/getWorkInfo", produces = "application/json", method= RequestMethod.GET)
    public WorkInfoVO getWorkInfo(){
        
    }
}
