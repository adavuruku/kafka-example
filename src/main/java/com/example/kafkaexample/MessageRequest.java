package com.example.kafkaexample;

public class MessageRequest {
    String message;

    public MessageRequest(String message) {
        this.message = message;
    }
    public MessageRequest() {}

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
