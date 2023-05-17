package com.example.springrabbitmqconsumer.listener;

import com.example.springrabbitmqconsumer.config.MQConfig;
import com.example.springrabbitmqconsumer.model.CustomMessage;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MessageListener {

    @RabbitListener(queues = MQConfig.QUEUE)
    public void listener(CustomMessage message) {
        System.out.println(message);
    }

}
