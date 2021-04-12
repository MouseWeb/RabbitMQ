package br.com.mouseweb.amqp;

public interface AmqpConsumer<T> {
    void consumer(T t);
}
