package com.joey.ssm.test.facade;

import com.joey.ssm.test.biz.TestBiz;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by yp-tc-m-7179 on 2018/3/22.
 */
@Service
public class TestFacadeImpl implements TestFacade{
    @Resource
    private TestBiz testBiz;

    public void test() {
        testBiz.test();
    }
}
