package br.com.mouseweb.service.impl;

import br.com.mouseweb.amqp.AmqpProducer;
import br.com.mouseweb.dto.MensagemDto;
import br.com.mouseweb.service.AmqpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQServiceImpl implements AmqpService {

    @Autowired
    private AmqpProducer<MensagemDto> amqp;

    @Override
    public void sendToConsumer(MensagemDto mensagemDto) {
        amqp.producer(mensagemDto);
    }

}
