package com.app.reactive;

import java.util.concurrent.Flow;

public class User implements Flow.Subscriber<String> {

    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void onSubscribe(Flow.Subscription subscription) {
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
