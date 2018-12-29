package com.telran.springbeansdemo;

import com.telran.springbeansdemo.service.MailService;
import com.telran.springbeansdemo.service.MailServiceType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Map;

@Service
public class Runner implements CommandLineRunner {

    @Value(value = "${any.property}")
    private String myProperty;

    //init-method - @PostConstruct

    @Autowired
    private ApplicationContext applicationContext;

//    @Autowired
//    private MailService mailService;


//    @Autowired
//    @Qualifier("string1")
//    private String string1;

//    @Autowired
//    @Qualifier("string2")
//    private String string2;

//    @Autowired
//    @Qualifier(value = "strings")
//    private List<String> stringBeansList;


    //ApplicationContext internally
    //mailService, MailServiceImpl.class


//    @Autowired
//    private Map<String, Object> allBeansInTheSystem;



    @Autowired
    private Map<String, MailService> mailServices;

    @Autowired
    private Map<MailServiceType, MailService> mailServicesByEnum;




    @Override
    public void run(String... args) throws Exception {
//        mailServices.get("forgottenService").printText();
//        mailServices.get("registrationService").printText();
//        mailServices.get("defaultService").printText();


        mailServicesByEnum.get(MailServiceType.DEFAULT_MAIL_SERVICE).printText();
        mailServicesByEnum.get(MailServiceType.REGISTRATION_MAIL_SERVICE).printText();
        mailServicesByEnum.get(MailServiceType.FORGOTTEN_PASSWORD_SERVICE).printText();

//        System.out.println(myProperty);

//        mailService.printText();

//        System.out.println(string);
//        System.out.println(stringBeansList);


    }

    @PostConstruct
    public void initMethod() {
        System.out.println(">>Init method works!!");
    }
}
