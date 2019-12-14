package gau.nika.service.impl;

import gau.nika.service.Generator;
import gau.nika.util.Lang;
import gau.nika.util.UserSettings;

import java.util.concurrent.ThreadLocalRandom;

public class SentenceGenerator implements Generator {
    private Generator wordGenerator;
    private UserSettings userSettings;

    public SentenceGenerator(Generator wordGenerator, UserSettings userSettings) {
        this.wordGenerator = wordGenerator;
        this.userSettings = userSettings;
    }

    @Override
    public String generate(int min, int max, Lang lang) {
        int wordCount = ThreadLocalRandom.current().nextInt(min, max);
        StringBuilder result = new StringBuilder("    ");

        for (int i = 0; i < wordCount; i++) {
            result.append(wordGenerator.generate(
                    userSettings.getMinSymbolsInWord(),
                    userSettings.getMaxSymbolsInWord(),
                    lang)
            );
        }
        result.append(".");
        return result.toString();
    }
}
