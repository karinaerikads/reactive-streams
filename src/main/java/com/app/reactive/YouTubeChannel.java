package com.app.reactive;

import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

import java.util.ArrayList;
import java.util.List;

public class YouTubeChannel implements Publisher<String> {

    private List<String> videos = new ArrayList<>();

    public void addVideo(String title){
        videos.add(title);
    }

    @Override
    public void subscribe(Subscriber<? super String> subscriber) {
        subscriber.onSubscribe(new YouTubeSubscription(subscriber, videos));
    }
}
