package com.telran.springbeansdemo;

import com.telran.springbeansdemo.service.MailService;
import com.telran.springbeansdemo.service.MailServiceType;
import com.telran.springbeansdemo.service.impl.MailServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Configuration
public class MyApplicationConfiguration {

//    @Bean(initMethod = "initMethod", destroyMethod = "destroy")
    public MailService mailService() {
        MailService mailService = new MailServiceImpl();
        return mailService;
    }




    @Bean
    public String string1() {
        return "string1";
    }

    @Bean(value = "string2")
    public String string2() {
        return "string2";
    }

    @Bean
    public List<String> strings(List<String> stringList) {
        //@Autowired
        //private Thread thread


        List<String> list = new ArrayList<>();
        list.add("list-string-1");
        list.add("list-string-2");
        list.addAll(stringList);

        return list;
    }

    @Bean
    public Map<MailServiceType, MailService> mailServices(Map<String, MailService> mailServiceMap) {
        Map<MailServiceType, MailService> map = new HashMap<>();

        for (Map.Entry<String, MailService> springMap : mailServiceMap.entrySet()) {
            map.put(MailServiceType.getById(springMap.getKey()), springMap.getValue());
        }

//        mailServiceMap.entrySet()
//                .stream()
//                .collect(Collectors.toMap(
//                        x -> MailServiceType.getById(x.getKey()),
//                        Map.Entry::getValue
//                ));

        return map;
    }




}
