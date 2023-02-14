package com.alejandromo.mensajes_app;

public class Message {
    int messageId;
    String message;
    String authorMessage;
    String dateMessage;

    public Message() {

    }

    public Message(String message, String authorMessage, String dateMessage) {
        this.message = message;
        this.authorMessage = authorMessage;
        this.dateMessage = dateMessage;
    }

    public int getMessageId() {
        return messageId;
    }

    public void setMessageId(int messageId) {
        this.messageId = messageId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getAuthorMessage() {
        return authorMessage;
    }

    public void setAuthorMessage(String authorMessage) {
        this.authorMessage = authorMessage;
    }

    public String getDateMessage() {
        return dateMessage;
    }

    public void setDateMessage(String dateMessage) {
        this.dateMessage = dateMessage;
    }
}
