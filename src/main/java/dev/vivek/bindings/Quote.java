package dev.vivek.bindings;

import lombok.Data;

@Data
public class Quote {
    private String _id;
    private String content;
    private String author;
    private String authorSlug;
    private String length;
    private String dateAdded;
    private String dateModified;
    private String[] tags;
}
