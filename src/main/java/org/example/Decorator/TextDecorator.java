package org.example.Decorator;

public abstract class TextDecorator implements Text{
    private Text text;

    public TextDecorator(Text text){
        this.text = text;
    }

    public String getText(){
        return text.getText();
    }

}
