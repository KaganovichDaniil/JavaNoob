package ru.itis.tokenizer.tokens;

import ru.itis.tokenizer.observer.TokenHandler;


public class Separator extends Token {
    private char type;
    public Separator() {
        super();
    }

    public Separator(int begin, int end, String text, char type) {
        super(begin, end, text);
        this.type = type;
    }
}
