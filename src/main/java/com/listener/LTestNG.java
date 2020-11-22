package com.listener;

import com.test.BaseCase;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

/**
 * TestNG用例执行情况监听器
 * @author Bo Yue
 * @date 2020/5/27
 */
public class LTestNG implements ITestListener{
    @Override
    public void onTestStart(ITestResult result) {
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        BaseCase.ThreadCounter.get().addSuccess();
    }

    @Override
    public void onTestFailure(ITestResult result) {
        BaseCase.ThreadCounter.get().addFailure();
    }

    @Override
    public void onTestSkipped(ITestResult result) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {

    }

    @Override
    public void onStart(ITestContext context) {

    }

    @Override
    public void onFinish(ITestContext context) {
    }
}
