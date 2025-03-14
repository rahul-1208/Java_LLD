package org.example.Decorator;

public class BoldDecorator extends TextDecorator{

    public BoldDecorator(Text text) {
        super(text);
    }

    public String getText(){
        return "<b> "+ super.getText() + "</b>";
    }
}
