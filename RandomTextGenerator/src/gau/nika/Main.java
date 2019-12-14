package gau.nika;

import gau.nika.service.Generator;
import gau.nika.service.impl.SentenceGenerator;
import gau.nika.service.impl.TextGenerator;
import gau.nika.service.impl.WordGenerator;
import gau.nika.util.Parser;
import gau.nika.util.UserSettings;
import gau.nika.util.UserSettingsParser;

import java.util.InvalidPropertiesFormatException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InvalidPropertiesFormatException {
        Scanner input = new Scanner(System.in);

        System.out.println("Input Language: ");
        String lang = input.nextLine();

        System.out.println("Input Parameters: ");
        String params = input.nextLine();

        Parser parser = new UserSettingsParser();
        UserSettings userSettings = parser.parse(lang, params);

        Generator wordGenerator = new WordGenerator();
        Generator sentenceGenerator = new SentenceGenerator(wordGenerator, userSettings);
        Generator textGenerator = new TextGenerator(sentenceGenerator, userSettings);

        System.out.println(userSettings);

        String generatedText = textGenerator.generate(userSettings.getSentenceCount(),
                1,
                userSettings.getLang()
        );

        // p-2-s-5-7-w-7-9

        System.out.println("\n Your Text:");
        System.out.println(generatedText);


    }
}
