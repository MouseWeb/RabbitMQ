package br.com.mouseweb.service;

import br.com.mouseweb.dto.MensagemDto;

public interface ConsumerService {

    void action(MensagemDto mensagemDto);

}