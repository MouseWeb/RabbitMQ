package br.com.mouseweb.service.impl;

import br.com.mouseweb.amqp.AmqpRePublish;
import br.com.mouseweb.service.RePublishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RePublishServiceImpl implements RePublishService {

    @Autowired
    private AmqpRePublish rePublish;

    @Override
    public void repost() {
        rePublish.rePublish();
    }

    @Override
    public void forcaRePost() {
        rePublish.forcaRePublish();
    }

}