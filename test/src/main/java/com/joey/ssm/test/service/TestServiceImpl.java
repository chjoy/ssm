package com.joey.ssm.test.service;

import org.springframework.stereotype.Service;

/**
 * Created by yp-tc-m-7179 on 2018/3/22.
 */
@Service
public class TestServiceImpl implements TestService{
    public void test() {
        System.out.println("spring test ok!");
    }
}
