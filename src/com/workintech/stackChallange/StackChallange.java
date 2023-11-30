package com.workintech.stackChallange;

import java.util.Locale;
import java.util.Objects;

public class StackChallange {

    private String sentence;

    public StackChallange(String sentence) {
        this.sentence = sentence;
    }

    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    public String removeSpecials(){
        if(sentence != null){
          return sentence.replaceAll("[.,!?']", "").toLowerCase(Locale.ENGLISH);
        }
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StackChallange that = (StackChallange) o;
        return Objects.equals(sentence, that.sentence);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sentence);
    }

    @Override
    public String toString() {
        return "StackChallange{" +
                "sentence='" + sentence + '\'' +
                '}';
    }
}
