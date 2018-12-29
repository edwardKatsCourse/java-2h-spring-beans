package com.telran.springbeansdemo.service.impl;

import com.telran.springbeansdemo.service.MailService;
import org.springframework.stereotype.Service;

@Service("forgottenService")
public class ForgottenPasswordMailServiceImpl implements MailService {
    @Override
    public void printText() {
        System.out.println("ForgottenPasswordMailServiceImpl");
    }

    @Override
    public void initMethod() {

    }

    @Override
    public void destroy() {

    }
}
