package com.example.budiharta.newsapps.data.remote.model;

/**
 * Created by budiharta on 1/14/2018.
 */

public class NewsItem {

    private string urlCover;
    private string title;
    private string author;
    private string description;

    public string getUrlCover() {
        return urlCover;
    }

    public void setUrlCover(string urlCover) {
        this.urlCover = urlCover;
    }

    public string getTitle() {
        return title;
    }

    public void setTitle(string title) {
        this.title = title;
    }

    public string getAuthor() {
        return author;
    }

    public void setAuthor(string author) {
        this.author = author;
    }

    public string getDescription() {
        return description;
    }

    public void setDescription(string description) {
        this.description = description;
    }
}
