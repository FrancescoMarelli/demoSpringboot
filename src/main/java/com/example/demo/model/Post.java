package com.example.demo.model;

import java.util.Date;

public class Post {
    private int id;
    private String title;
    private String content;
    private String urlImage;
    private Date date;

    public Post() {
    }

    public Post(int id, String title, String content, String urlImage, Date date) {
        super();
        this.id = id;
        this.title = title;
        this.content = content;
        this.urlImage = urlImage;
        this.date = date;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public Date getDate() {
        return date;
    }



}
