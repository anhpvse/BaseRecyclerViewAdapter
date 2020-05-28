package com.example.baserecyclerviewadapter.models;

public class Items {
    private int id;
    private String text;

    public Items() {
    }

    public Items(String text) {
        this.text = text;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
