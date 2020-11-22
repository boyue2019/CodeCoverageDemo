package com.controller;

import com.service.api.TestNgExecuteService;
import com.service.api.TestReportService;
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
        int result = 0;

        if (token.equals("") || token == null){
            //testNgExecuteService.TestCaseExecute(testNgExecuteService.TestCaseIntegration());
            //return testReportService.ApiResult();

            if (token.length() > 5){
                result = 10;
                System.out.println("result:" + result);
            }else {
                result = 5;
                System.out.println("result:" + result);
            }
            System.out.println("授权失败；token:" + token);
            return "授权失败";
        }else {
            System.out.println("授权成功；token:" + token);
            return "授权成功；token:" + token;
            //return BaseCase.ThreadResult.get();
        }
    }
}
