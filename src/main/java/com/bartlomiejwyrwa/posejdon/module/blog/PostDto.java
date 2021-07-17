package com.bartlomiejwyrwa.posejdon.module.blog;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.UUID;

public class PostDto {
private String uuid;
private String title;
private String text;
@Autowired
    public PostDto(String uuid, String title, String text) {
        this.uuid = uuid;
        this.title = title;
        this.text = text;
    }

    public PostDto(String title, String text) {
        this.uuid= UUID.randomUUID().toString();
        this.title = title;
        this.text = text;
    }

    public String getUuid() {
        return uuid;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }
}
