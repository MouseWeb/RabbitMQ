package br.com.mouseweb.amqp.impl;

import br.com.mouseweb.amqp.AmqpConsumer;
import br.com.mouseweb.dto.MensagemDto;
import br.com.mouseweb.service.ConsumerService;
import org.springframework.amqp.AmqpRejectAndDontRequeueException;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RabbitMQConsumerImpl implements AmqpConsumer<MensagemDto> {

    @Autowired
    private ConsumerService consumerService;

    @Override
    @RabbitListener(queues = "${spring.rabbitmq.request.routing-key.producer}")
    public void consumer(MensagemDto mensagemDto) {
        try {
            consumerService.action(mensagemDto);
        } catch (Exception ex) {
            throw new AmqpRejectAndDontRequeueException(ex);
        }
    }
}
