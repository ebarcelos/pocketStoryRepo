package org.academiadecodigo.codezillas.model;

import javax.persistence.Entity;

@Entity
public class User {

    private String username;
    private String password;
    private String nickname;
    private Story[] ownStories;
    private Story[] favStories;

    public User(){

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Story[] getOwnStories() {
        return ownStories;
    }

    public void setOwnStories(Story[] ownStories) {
        this.ownStories = ownStories;
    }

    public Story[] getFavStories() {
        return favStories;
    }

    public void setFavStories(Story[] favStories) {
        this.favStories = favStories;
    }
}
