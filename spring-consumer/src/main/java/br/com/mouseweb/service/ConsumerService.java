package br.com.mouseweb.service;

import br.com.mouseweb.dto.MensagemDto;

public interface ConsumerService {

    void action(MensagemDto mensagemDto) throws Exception;
    //void action(MensagemDto mensagemDto);
}