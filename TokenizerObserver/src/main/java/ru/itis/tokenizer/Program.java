package ru.itis.tokenizer;

import ru.itis.tokenizer.handlers.TokenHandlerNumbersImpl;
import ru.itis.tokenizer.handlers.TokenHandlerStandardOutputImpl;
import ru.itis.tokenizer.handlers.TokenHandlerWordImpl;
import ru.itis.tokenizer.handlers.Tokenizer;
import ru.itis.tokenizer.observer.TokenizerObservable;

/**
 * Created by admin on 12.11.2016.
 */
public class Program {
    public static void main(String[] args) {
        String text = "!!!abс 123 def 34 !!g";
        TokenizerObservable tokenizer = new Tokenizer();
        tokenizer.addTokenHandler(new TokenHandlerNumbersImpl());
        tokenizer.addTokenHandler(new TokenHandlerStandardOutputImpl());
        tokenizer.addTokenHandler(new TokenHandlerWordImpl());
        tokenizer.tokenize(text);
    }


}
