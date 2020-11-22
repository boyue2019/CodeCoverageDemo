package com.service.api;

import org.testng.TestNG;

/**
 * 测试用例操作接口
 *
 * @author Bo Yue
 * @date 2020/5/27
 */
public interface TestNgExecuteService {
    /**
     * 通过TestNG自带方法整合测试用例
     */
    TestNG TestCaseIntegration();

    /**
     * 通过TestNG自带方法执行测试用例
     */
    void TestCaseExecute(TestNG testNG);
}
