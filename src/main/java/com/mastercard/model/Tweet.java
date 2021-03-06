package com.mastercard.model;

import java.util.Date;

/**
 * Created by e068806 on 7/3/2017.
 */
public class Tweet {
    String text;
    Long id;

    public Tweet(String text, Long id, Long userId, Date createdAt) {
        this.text = text;
        this.id = id;
        this.userId = userId;
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "Tweet{" +
                "text='" + text + '\'' +
                ", id=" + id +
                ", userId=" + userId +
                ", createdAt=" + createdAt +
                '}';
    }

    public Tweet() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    Long userId;
    Date createdAt;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
