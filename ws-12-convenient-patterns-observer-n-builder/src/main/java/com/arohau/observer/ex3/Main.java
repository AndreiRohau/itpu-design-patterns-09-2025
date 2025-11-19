package com.arohau.observer.ex3;

public class Main {
    public static void main(String[] args) {
        NewsAgency publisher = new NewsAgency();
        NewsChannel observer1 = new NewsChannel();
        NewsChannel observer2 = new NewsChannel();

        publisher.addObserver(observer1);
        publisher.addObserver(observer2);
        final String news = "we got some hot news for you";
        publisher.setNews(news);

        System.out.println(observer1.getNews().equals(news));
        System.out.println(observer2.getNews().equals(news));
    }
}
