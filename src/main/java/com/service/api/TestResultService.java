package com.service.api;

import com.vo.TestResultVo;

/**
 * 测试报告相关功能接口
 *
 * @author Bo Yue
 * @date 2020/6/02
 */
public interface TestResultService {
    /**
     * 测试用例执行接口返回结果
     * @return
     */
    TestResultVo success();
}
