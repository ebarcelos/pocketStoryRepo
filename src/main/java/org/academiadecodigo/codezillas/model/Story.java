package org.academiadecodigo.codezillas.model;

public class Story {

    private User author;
    private String datePublished;
    private String title;
    private String text;
    private int rank;
    private String photos;
    private User[] likedUsers;
    private String location;

    public Story(){

    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
