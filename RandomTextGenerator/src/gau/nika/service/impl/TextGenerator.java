package gau.nika.service.impl;

import gau.nika.service.Generator;
import gau.nika.util.Lang;
import gau.nika.util.UserSettings;

import java.util.concurrent.ThreadLocalRandom;

public class TextGenerator implements Generator {
    private Generator sentenceGenerator;
    private UserSettings userSettings;

    public TextGenerator(Generator sentenceGenerator, UserSettings userSettings) {
        this.sentenceGenerator = sentenceGenerator;
        this.userSettings = userSettings;
    }

    @Override
    public String generate(int min, int max, Lang lang) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < min; i++) {
            result.append(sentenceGenerator.generate(
                    userSettings.getMinWordsInSentence(),
                    userSettings.getMaxWordsInSentence(),
                    lang)
            );
        }
        result.append("    ");
        return result.toString();
    }
}
