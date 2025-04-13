package com.app.reactive;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

import java.util.List;

public class YouTubeSubscription implements Subscription {
    public YouTubeSubscription(Subscriber<? super String> subscriber, List<String> videos) {
    }

    @Override
    public void request(long l) {

    }

    @Override
    public void cancel() {

    }
}
