package br.com.mouseweb.service.impl;

import br.com.mouseweb.dto.MensagemDto;
import br.com.mouseweb.service.ConsumerService;
import org.springframework.stereotype.Service;

@Service
public class ConsumerServiceImpl implements ConsumerService {

    @Override
    public void action(MensagemDto mensagemDto) throws Exception {
        //throw new Exception("Erro ao consumir a mensagem");
        System.out.println(mensagemDto.getText());
    }

    /*@Override
    public void action(MensagemDto mensagemDto) {
        System.out.println(mensagemDto.getText());
    }*/

}