package com.app.reactive;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

public class User implements Subscriber<String> {

    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void onSubscribe(Subscription subscription) {
        System.out.println("onSubscribe("+name+")");
        subscription.request(Long.MAX_VALUE);
    }

    @Override
    public void onNext(String video) {
        System.out.println("onNext("+video+")");
    }

    @Override
    public void onError(Throwable error) {
        System.out.println("onError: "+error);
    }

    @Override
    public void onComplete() {
        System.out.println("onComplete()");
    }
}
