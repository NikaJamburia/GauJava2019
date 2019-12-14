package gau.nika.service.impl;

import gau.nika.service.Generator;
import gau.nika.util.Lang;

import java.util.concurrent.ThreadLocalRandom;

public class WordGenerator implements Generator {

    @Override
    public String generate(int min, int max, Lang lang) {
        int length = ThreadLocalRandom.current().nextInt(min, max);
        StringBuilder result = new StringBuilder();
        String vocabulary = lang.vocab;

        for (int i = 0; i < length; i++) {
            result.append(vocabulary.charAt(ThreadLocalRandom.current().nextInt(0, vocabulary.length())));
        }
        result.append(" ");
        return result.toString();
    }
}
