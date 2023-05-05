package com.gk2982.SpringSecurityPractice.event.listner;

import com.gk2982.SpringSecurityPractice.collections.User;
import com.gk2982.SpringSecurityPractice.event.RegistrationCompleteEvent;
import org.springframework.context.ApplicationListener;

import java.util.UUID;

public class ResitrationCompleteEventListner implements ApplicationListener<RegistrationCompleteEvent> {
    @Override
    public void onApplicationEvent(RegistrationCompleteEvent event) {
                User user = event.getUser();
                String token = UUID.randomUUID().toString();
    }
}
