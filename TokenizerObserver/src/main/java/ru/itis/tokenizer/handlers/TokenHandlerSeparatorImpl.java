package ru.itis.tokenizer.handlers;

import ru.itis.tokenizer.observer.TokenHandler;
import ru.itis.tokenizer.tokens.Number;
import ru.itis.tokenizer.tokens.Separator;
import ru.itis.tokenizer.tokens.Token;


public class TokenHandlerSeparatorImpl implements TokenHandler {
    @Override
    public void handleToken(Token token) {
        if (token.getClass().getName().equals(Separator.class.getName())) {
            System.out.println("from: " + " " + getName() + " I'm on separator! " + token);
        }
    }

    @Override
    public String getName() {
        return "SeparatorHandler";
    }
}
