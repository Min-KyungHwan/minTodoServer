package com.mkh.todo.api.controller;

import com.mkh.todo.api.service.WorkInfoService;
import com.mkh.todo.api.vo.WorkInfoVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
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
        WorkInfoVO param = new WorkInfoVO();
        return workInfoService.getWorkInfo(param);
    }
    
    @RequestMapping(value="/setWorkInfo", consumes = "application/json", produces = "application/json", method= RequestMethod.POST)
    public ResponseEntity<String> setWorkInfo(@RequestBody WorkInfoVO workInfoVO) {
        try {
//            logger.info("Received work info: " + workInfo);
            workInfoService.setWorkInfo(workInfoVO);
            return new ResponseEntity<>("Work info set successfully", HttpStatus.CREATED);
        } catch (Exception e) {
//            logger.error("Failed to set work info", e);
            return new ResponseEntity<>("Failed to set work info", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(value="addWorkInfo", consumes = "application/json"., produces = "application/json", method= RequestMethod.POST)
    public ResponseEntity<String> addWorkInfo(@RequestBody WorkInfoVO workInfoVO) {
        try {
            workInfoService.addWorkInfo(workInfoVO);
        } catch (Exception e) {
            return new ResponseEntity<>("Failed to add wirk info", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
