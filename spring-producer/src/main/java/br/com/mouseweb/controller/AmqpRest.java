package br.com.mouseweb.controller;

import br.com.mouseweb.dto.MensagemDto;
import br.com.mouseweb.service.AmqpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")
public class AmqpRest {

    @Autowired
    private AmqpService service;

    @PostMapping("/send")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void sendToConsumer(@RequestBody MensagemDto mensagemDto) {
        service.sendToConsumer(mensagemDto);
    }

}
