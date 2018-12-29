package com.telran.springbeansdemo.service.impl;

import com.telran.springbeansdemo.service.MailService;
import org.springframework.stereotype.Service;

import javax.annotation.PreDestroy;

@Service(value = "defaultService")        /*(value = "mailService")*/
public class MailServiceImpl implements MailService {

    private String irregularProperty;

    @Override
    public void printText() {
        System.out.println("MailServiceImpl");
    }

    public void initMethod() {
        System.out.println("MailService >> init method");
    }

//    @PreDestroy
    public void destroy() {

        System.out.println(">>>>>>MailServiceImpl destroy");

    }
}
