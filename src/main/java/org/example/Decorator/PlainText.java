package org.example.Decorator;

public class PlainText implements Text{
    private String text;

    public PlainText(String content){
        this.text = content;
    }

    @Override
    public String getText() {
        return "Hello World";
    }
}
