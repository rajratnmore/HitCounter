package com.geekster.HitCounter.Model;


public class User {
    private String username;
    private Integer hitcount;


    public User() {
    }
    public User(String username, Integer hitcount) {
        this.username = username;
        this.hitcount = hitcount;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getHitcount() {
        return hitcount;
    }

    public void setHitcount(Integer hitcount) {
        this.hitcount = hitcount;
    }


}
