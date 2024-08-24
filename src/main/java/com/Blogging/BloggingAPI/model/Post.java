package com.Blogging.BloggingAPI.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Getter
@Setter
@Document(collection = "posts")
public class Post {

    @Id
    public String id;
    public String title;
    public String content;
    public List<String> tags;
    public String category;

    @Override
    public String toString() {
        return "Post{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", tags=" + tags +
                ", category='" + category + '\'' +
                '}';
    }
}
