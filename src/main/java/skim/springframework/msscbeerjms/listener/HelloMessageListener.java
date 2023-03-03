package skim.springframework.msscbeerjms.listener;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;
import skim.springframework.msscbeerjms.config.JmsConfig;
import skim.springframework.msscbeerjms.model.HelloWorldMessage;

import javax.jms.Message;

@Component
public class HelloMessageListener {

    @JmsListener(destination = JmsConfig.MY_QUEUE)
    public void listen(@Payload HelloWorldMessage helloWorldMessage,
                       @Headers MessageHeaders headers, Message message) {
        System.out.println("I got a Message!");

        System.out.println(helloWorldMessage);
    }
}
