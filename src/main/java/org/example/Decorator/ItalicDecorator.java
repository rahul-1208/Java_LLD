package org.example.Decorator;

public class ItalicDecorator extends TextDecorator{

    public ItalicDecorator(Text text) {
        super(text);
    }

    public String getText(){
        return "<i>" + super.getText() + "</i>";
    }
}
