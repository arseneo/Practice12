package com.mirea.kt.example;

import java.io.Serializable;

public class Message implements Serializable {
    private static final long serialVersionUID = -3380157693869190848L;
    
    private int id;
    private String body;
    private String type;
    private boolean hasAttachments;
    private long timestamp;

    public Message(int id, String body, String type, boolean hasAttachments, long timestamp) {
        this.id = id;
        this.body = body;
        this.type = type;
        this.hasAttachments = hasAttachments;
        this.timestamp = timestamp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean getHasAttachments() {
        return hasAttachments;
    }

    public void setHasAttachments(boolean hasAttachments) {
        this.hasAttachments = hasAttachments;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "Message{" + '\n' +
                "id=" + id + '\n' +
                "body='" + body + '\n' +
                "type='" + type + '\n' +
                "hasAttachments=" + hasAttachments + '\n' +
                "timestamp=" + timestamp + '\n' +
                '}';
    }
}