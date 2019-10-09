package com.bing.recyclerviewanimated;

public class Item {

    private String title, description, date;
    int userPhoto;


    public Item(){

    }

    public Item(String title, String description, String date, int userPhoto) {
        this.title = title;
        this.description = description;
        this.date = date;
        this.userPhoto = userPhoto;
    }


    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setUserPhoto(int userPhoto) {
        this.userPhoto = userPhoto;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getDate() {
        return date;
    }

    public int getUserPhoto() {
        return userPhoto;
    }
}
