package br.com.mouseweb.amqp;

public interface AmqpProducer<T> {
    void producer(T t);
}
