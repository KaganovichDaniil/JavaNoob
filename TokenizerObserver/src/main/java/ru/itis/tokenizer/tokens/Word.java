package ru.itis.tokenizer.tokens;


public class Word extends Token{

    private String word;

    public Word() {
        super();
    }

    public Word(int begin, int end, String text, String word) {
        super(begin, end, text);
        this.word = word;
    }

    public String getWord (){
        return this.word;
    }

    public void setWord (String word){
        this.word=word;
    }
}
