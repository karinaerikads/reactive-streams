package com.app.reactive;

import org.reactivestreams.Subscriber;

public class Main {
    public static void main(String[] args) {
        YouTubeChannel channel = new YouTubeChannel();
        channel.addVideo("Reactive programming with java");
        channel.addVideo("Introduction to Machine Learning");
        channel.addVideo("Web development basic");

        User userSubscriber = new User("Karina");
        channel.subscribe((Subscriber<? super String>) userSubscriber);
    }
}