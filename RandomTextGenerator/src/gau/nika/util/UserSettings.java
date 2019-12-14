package gau.nika.util;

public class UserSettings {
    private Lang lang;
    private int sentenceCount;
    private int minWordsInSentence;
    private int maxWordsInSentence;
    private int minSymbolsInWord;
    private int maxSymbolsInWord;

    public Lang getLang() {
        return lang;
    }

    public int getSentenceCount() {
        return sentenceCount;
    }

    public int getMinWordsInSentence() {
        return minWordsInSentence;
    }

    public int getMaxWordsInSentence() {
        return maxWordsInSentence;
    }

    public int getMinSymbolsInWord() {
        return minSymbolsInWord;
    }

    public int getMaxSymbolsInWord() {
        return maxSymbolsInWord;
    }

    public void setLang(Lang lang) {
        this.lang = lang;
    }

    public void setSentenceCount(int sentenceCount) {
        this.sentenceCount = sentenceCount;
    }

    public void setMinWordsInSentence(int minWordsInSentence) {
        this.minWordsInSentence = minWordsInSentence;
    }

    public void setMaxWordsInSentence(int maxWordsInSentence) {
        this.maxWordsInSentence = maxWordsInSentence;
    }

    public void setMinSymbolsInWord(int minSymbolsInWord) {
        this.minSymbolsInWord = minSymbolsInWord;
    }

    public void setMaxSymbolsInWord(int maxSymbolsInWord) {
        this.maxSymbolsInWord = maxSymbolsInWord;
    }

    @Override
    public String toString() {
        return "UserSettings{" +
                "lang=" + lang +
                ", sentenceCount=" + sentenceCount +
                ", minWordsInSentence=" + minWordsInSentence +
                ", maxWordsInSentence=" + maxWordsInSentence +
                ", minSymbolsInWord=" + minSymbolsInWord +
                ", maxSymbolsInWord=" + maxSymbolsInWord +
                '}';
    }
}
