package com.crowxxx.fake_qq;

public class User {
    private int id;
    private String slug;
    private String nickname;
    private String avatar_source;
    private int total_likes_count;
    private int total_wordage;
    private boolean is_following_user;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getAvatar_source() {
        return avatar_source;
    }

    public void setAvatar_source(String avatar_source) {
        this.avatar_source = avatar_source;
    }

    public int getTotal_likes_count() {
        return total_likes_count;
    }

    public void setTotal_likes_count(int total_likes_count) {
        this.total_likes_count = total_likes_count;
    }

    public int getTotal_wordage() {
        return total_wordage;
    }

    public void setTotal_wordage(int total_wordage) {
        this.total_wordage = total_wordage;
    }

    public boolean isIs_following_user() {
        return is_following_user;
    }

    public void setIs_following_user(boolean is_following_user) {
        this.is_following_user = is_following_user;
    }
}
