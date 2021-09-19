package br.com.mouseweb.service.impl;

import br.com.mouseweb.dto.MensagemDto;
import br.com.mouseweb.service.ConsumerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ConsumerServiceImpl implements ConsumerService {

    @Override
    public void action(MensagemDto mensagemDto) throws Exception {
        //throw new Exception("Erro ao consumir a mensagem");
        if ("testeeee".equalsIgnoreCase(mensagemDto.getText())){
            throw new Exception("ERROR - Teste");
        } else {
            log.debug(mensagemDto.getText());
        }

    }

    /*@Override
    public void action(MensagemDto mensagemDto) {
        System.out.println(mensagemDto.getText());
    }*/

}