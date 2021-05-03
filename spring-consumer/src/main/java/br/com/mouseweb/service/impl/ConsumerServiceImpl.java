package br.com.mouseweb.service.impl;

import br.com.mouseweb.dto.MensagemDto;
import br.com.mouseweb.service.ConsumerService;
import org.springframework.amqp.AmqpRejectAndDontRequeueException;
import org.springframework.stereotype.Service;

@Service
public class ConsumerServiceImpl implements ConsumerService {

    @Override
    public void action(MensagemDto mensagemDto) throws Exception {
        //throw new Exception("Erro ao consumir a mensagem");
        if ("teste".equalsIgnoreCase(mensagemDto.getText())){
            throw new AmqpRejectAndDontRequeueException("ERROR - Teste");
        } else {
            System.out.println(mensagemDto.getText());
        }

    }

    /*@Override
    public void action(MensagemDto mensagemDto) {
        System.out.println(mensagemDto.getText());
    }*/

}