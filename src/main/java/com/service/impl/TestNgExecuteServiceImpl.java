package com.service.impl;

import com.service.api.TestNgExecuteService;
import org.springframework.stereotype.Component;
import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

import java.util.ArrayList;
import java.util.List;

/**
 * 测试用例操作接口实现类
 * @author Bo Yue
 * @date 2020/5/27
 */
@Component
public class TestNgExecuteServiceImpl implements TestNgExecuteService {
    @Override
    public TestNG TestCaseIntegration(){
        //设置Suite标签
        XmlSuite xmlSuite = new XmlSuite();
        //设置监听器
        List<String> listen = new ArrayList<String>();
        listen.add("com.listener.LTestNG");
        xmlSuite.setName("Test Demo");
        xmlSuite.setListeners(listen);

        //设置Test标签
        XmlTest xmlTest = new XmlTest(xmlSuite);
        xmlTest.setVerbose(2);
        xmlTest.setPreserveOrder(true);
        xmlTest.setName("InterfaceTesting");

        //设置Class标签
        List<XmlClass> classes = new ArrayList<XmlClass>();
        classes.add(new XmlClass("com.test.DemoTestNG"));

        xmlTest.setXmlClasses(classes);

        List<XmlSuite> suites = new ArrayList<XmlSuite>();
        suites.add(xmlSuite);

        TestNG testNG = new TestNG();
        testNG.setXmlSuites(suites);

        return testNG;
    }

    @Override
    public void TestCaseExecute(TestNG testNG){
        testNG.run();
    }
}
