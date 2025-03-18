package org.example.Observer;

public class NewsReader implements NewsObservers {
    private String news;

    public void update(String news) {
        this.news = news;
        display(news);
    }

    private void display(String news) {
        System.out.println("News is "+news);
    }


}
