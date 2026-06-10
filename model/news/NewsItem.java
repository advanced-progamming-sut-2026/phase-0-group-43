package model.news;

import java.time.LocalDateTime;

public class NewsItem {
    private final String id;
    private final NewsType newsType;
    private final String message;
    private final LocalDateTime timestamp;
    private boolean read;

    public NewsItem(String id, NewsType newsType, String message, LocalDateTime timestamp) {
        this.id = id;
        this.newsType = newsType;
        this.message = message;
        this.timestamp = timestamp;
    }
}
