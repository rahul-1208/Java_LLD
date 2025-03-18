package org.example.Observer;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency {
    List<NewsReader> newsReaderList = new ArrayList<>();
    private String news ;

    public void setNews(String news) {
        this.news = news;
        notifyObservers();
    }

    public void attach(NewsReader newsReader){
        newsReaderList.add(newsReader);
    }

    public void detach(NewsReader newsReader){
        newsReaderList.remove(newsReader);

    }

    public void notifyObservers(){
        for(NewsReader nr: newsReaderList){
            nr.update(news);
        }
    }

}
