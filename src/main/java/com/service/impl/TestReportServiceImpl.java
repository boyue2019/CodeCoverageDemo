package com.service.impl;

import com.dto.Result;
import com.service.api.TestReportService;
import com.test.BaseCase;
import org.springframework.stereotype.Component;

/**
 * 测试报告相关功能接口实现类
 *
 * @author Bo Yue
 * @date 2020/5/27
 */
@Component
public class TestReportServiceImpl implements TestReportService {
    @Override
    public Result ApiResult() {
        BaseCase.ThreadResult.get().setMessage("成功");
        BaseCase.ThreadResult.get().setCode(0);
        BaseCase.ThreadResultBean.get().setPasses(BaseCase.ThreadCounter.get().getSuccess());
        BaseCase.ThreadResultBean.get().setFailures(BaseCase.ThreadCounter.get().getFailure());
        BaseCase.ThreadResult.get().setResult(BaseCase.ThreadResultBean.get());
        return BaseCase.ThreadResult.get();
    }
}
