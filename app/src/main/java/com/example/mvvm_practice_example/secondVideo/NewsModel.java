package com.example.mvvm_practice_example.secondVideo;

import java.util.ArrayList;

public class NewsModel {
    public String heading;
    public String description;

    public NewsModel() {

    }

    public NewsModel(News news){
        this.heading = news.heading;
        this.description = news.description;
    }

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<NewsModel> getArrayList(){
        ArrayList<NewsModel> list = new ArrayList<>();
        NewsModel newsModel1 = new NewsModel(new News("Abc","bla bla"));
        NewsModel newsModel2 = new NewsModel(new News("Abc","bla bla"));
        NewsModel newsModel3 = new NewsModel(new News("Abc","bla bla"));
        NewsModel newsModel4 = new NewsModel(new News("Abc","bla bla"));
        list.add(newsModel1);
        list.add(newsModel2);
        list.add(newsModel3);
        list.add(newsModel4);

        return list;
    }
}
