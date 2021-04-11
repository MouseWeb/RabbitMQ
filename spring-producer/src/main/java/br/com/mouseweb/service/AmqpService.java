package br.com.mouseweb.service;

import br.com.mouseweb.dto.MensagemDto;

public interface AmqpService {
    void sendToConsumer(MensagemDto mensagemDto);
}
