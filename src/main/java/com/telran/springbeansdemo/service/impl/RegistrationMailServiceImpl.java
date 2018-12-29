package com.telran.springbeansdemo.service.impl;

import com.telran.springbeansdemo.service.MailService;
import org.springframework.stereotype.Service;

@Service("registrationService")
public class RegistrationMailServiceImpl implements MailService {
    @Override
    public void printText() {
        System.out.println("RegistrationMailServiceImpl");

    }

    @Override
    public void initMethod() {

    }

    @Override
    public void destroy() {

    }
}
