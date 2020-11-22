package com.util;

/**
 * 测试用例执行结果计数器
 * @author Bo Yue
 * @date 2020/5/27
 */
public class TestCaseCounter {
    public int success = 0;
    public int failure = 0;

    public int getSuccess() {
        return success;
    }

    public int getFailure() {
        return failure;
    }

    public void addSuccess(){
        success = success + 1;
    }

    public void addFailure(){
        failure = failure + 1;
    }
}
