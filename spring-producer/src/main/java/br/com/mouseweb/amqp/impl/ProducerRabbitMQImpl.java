package br.com.mouseweb.amqp.impl;

import br.com.mouseweb.amqp.AmqpProducer;
import br.com.mouseweb.dto.MensagemDto;
import org.springframework.amqp.AmqpRejectAndDontRequeueException;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ProducerRabbitMQImpl implements AmqpProducer<MensagemDto> {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Value("${spring.rabbitmq.request.routing-key.producer}")
    private String queue;

    @Value("${spring.rabbitmq.request.exchange.producer}")
    private String exchange;

    @Override
    public void producer(MensagemDto mensagemDto) {
        try {
            for (int i = 0; i < 1000; i++) {
                rabbitTemplate.convertAndSend(exchange, queue, mensagemDto);
            }

        } catch ( Exception ex ) {
            throw new AmqpRejectAndDontRequeueException(ex);
        }
    }

}
