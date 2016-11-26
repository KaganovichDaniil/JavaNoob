package ru.itis.tokenizer.handlers;

import ru.itis.tokenizer.observer.TokenHandler;
import ru.itis.tokenizer.tokens.Number;
import ru.itis.tokenizer.tokens.Token;
import ru.itis.tokenizer.tokens.Word;

public class TokenHandlerWordImpl implements TokenHandler {
    public void handleToken(Token token) {
        // token instanceof letter.class
        if (token.getClass().getName().equals(Word.class.getName())) {
            System.out.println("from: " + " " + getName() + " I'm on word! " + token);
        }
    }

    public String getName() {
        return "WordHandler";
    }
}
