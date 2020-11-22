package com.test;

import com.dto.Result;
import com.util.TestCaseCounter;
import org.testng.annotations.BeforeTest;

public class BaseCase {
    public static ThreadLocal<TestCaseCounter> ThreadCounter = new ThreadLocal<>();
    public static ThreadLocal<Result> ThreadResult = new ThreadLocal<>();
    public static ThreadLocal<Result.ResultBean> ThreadResultBean = new ThreadLocal<>();

    @BeforeTest
    public void init(){
        TestCaseCounter testCaseCounter = new TestCaseCounter();
        Result result = new Result();
        Result.ResultBean resultBean = new Result.ResultBean();
        ThreadCounter.set(testCaseCounter);
        ThreadResult.set(result);
        ThreadResultBean.set(resultBean);
    }
}