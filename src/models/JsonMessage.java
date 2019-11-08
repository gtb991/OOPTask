package models;

public class JsonMessage implements Message {

    private String body;

    public String prepareMessage() {
        return body += " prepared JsonMessage; ";
    }

    @Override
    public String getBody() {
        return body;
    }

    public JsonMessage(String body) {
        this.body = body;
    }
}
