package com.example.myup;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

public class Bean {

    String name;
    Drawable head;
    int fanNum;


    public Bean() {
    }


    public Bean(String name) {
        this.name = name;
    }

    public Bean(String name, Drawable head) {
        this.name = name;
        this.head = head;
    }

    public int getFanNum() {
        return fanNum;
    }

    public void setFanNum(int fanNum) {
        this.fanNum = fanNum;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Drawable getHead() {
        return head;
    }

    public void setHead(Drawable head) {
        this.head = head;
    }
}
