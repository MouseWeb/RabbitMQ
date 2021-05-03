package br.com.mouseweb.controller;

import br.com.mouseweb.service.RePublishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AmqpContrloller {

    @Autowired
    private RePublishService service;

    @ResponseStatus(HttpStatus.ACCEPTED)
    @GetMapping("/repost")
    public void sendToQueue() {
        service.repost();
    }

    @ResponseStatus(HttpStatus.ACCEPTED)
    @GetMapping("/forcarepost")
    public void forcaMensage() {
        service.forcaRePost();
    }

}
