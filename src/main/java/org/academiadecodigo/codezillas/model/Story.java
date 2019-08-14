package org.academiadecodigo.codezillas.model;

import javax.persistence.Entity;

@Entity
public class Story {

    private String author;
    private String datePublished;
    private String title;
    private String text;
    private int rank;
    private String photos;
    private User[] likedUsers;
    private float longitude;
    private float latitude;
    private boolean ownStory;

    public Story() {

    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isOwnStory() {
        return ownStory;
    }

    public void setOwnStory(boolean ownStory) {
        this.ownStory = ownStory;
    }

    public String getDatePublished() {
        return datePublished;
    }

    public void setDatePublished(String datePublished) {
        this.datePublished = datePublished;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getPhotos() {
        return photos;
    }

    public void setPhotos(String photos) {
        this.photos = photos;
    }

    public User[] getLikedUsers() {
        return likedUsers;
    }

    public void setLikedUsers(User[] likedUsers) {
        this.likedUsers = likedUsers;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }
}
