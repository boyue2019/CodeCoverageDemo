package com.controller;

import com.dto.Result;
import com.service.api.TestNgExecuteService;
import com.service.api.TestReportService;
import com.test.BaseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/demo")
public class TestCaseExecuteController {
    @Autowired
    private TestNgExecuteService testNgExecuteService;

    @Autowired
    private TestReportService testReportService;

    /**
     * 测试用例执行接口
     * @param token
     * @return
     */
    @RequestMapping(value = "/it",method = RequestMethod.GET,produces = "application/json;charset=UTF-8")
    String getUserByGet(@RequestParam(value = "token") String token){
        if (token.equals("") || token == null){
            //testNgExecuteService.TestCaseExecute(testNgExecuteService.TestCaseIntegration());
            //return testReportService.ApiResult();
            System.out.println("授权失败；token:" + token);
            return "授权失败";
        }else {
            System.out.println("授权成功；token:" + token);
            return "授权成功；token:" + token;
            //return BaseCase.ThreadResult.get();
        }
    }
}
