package com.telran.springbeansdemo.service;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum MailServiceType {

    REGISTRATION_MAIL_SERVICE("registrationService"),
    FORGOTTEN_PASSWORD_SERVICE("forgottenService"),
    DEFAULT_MAIL_SERVICE("defaultService")
    ;

    private String mailServiceBeanName;

    public static MailServiceType getById(String id) {
        if (id == null) {
            throw new RuntimeException("Name cannot be null");
        }

        for (MailServiceType mailServiceType : MailServiceType.values()) {
            if (mailServiceType.getMailServiceBeanName().equals(id)) {
                return mailServiceType;
            }
        }

        return DEFAULT_MAIL_SERVICE;
    }
}
