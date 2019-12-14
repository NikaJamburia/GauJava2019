package gau.nika.util;

import java.util.InvalidPropertiesFormatException;

public class UserSettingsParser implements Parser {

    @Override
    public UserSettings parse(String lang, String params) throws InvalidPropertiesFormatException {
        UserSettings userSettings = new UserSettings();
        setLanguage(lang, userSettings);
        setParams(params, userSettings);
        return userSettings;
    }

    public void setLanguage(String lang, UserSettings userSettings) throws InvalidPropertiesFormatException {

        switch (lang){
            case "en":
                userSettings.setLang(Lang.EN);
                break;
            case "ru":
                userSettings.setLang(Lang.RU);
                break;
            case "ge":
                userSettings.setLang(Lang.GE);
                break;
            default:
                throw  new InvalidPropertiesFormatException("Invalid language");
        }

    }

    public void setParams(String userInput, UserSettings userSettings) throws InvalidPropertiesFormatException {
        try {
            int sentenceCount = Integer.parseInt(
                    Character.toString(
                            userInput.charAt(2))
            );
            userSettings.setSentenceCount(sentenceCount);

            int minWords = Integer.parseInt(
                    Character.toString(
                            userInput.charAt(6))
            );
            userSettings.setMinWordsInSentence(minWords);

            int maxWords = Integer.parseInt(
                    Character.toString(
                            userInput.charAt(8))
            );
            userSettings.setMaxWordsInSentence(maxWords);

            int minSymbols = Integer.parseInt(
                    Character.toString(
                            userInput.charAt(12))
            );
            userSettings.setMinSymbolsInWord(minSymbols);

            int maxSymbols = Integer.parseInt(
                    Character.toString(
                            userInput.charAt(14))
            );
            userSettings.setMaxSymbolsInWord(maxSymbols);
        }
        catch (Exception e){
            throw new InvalidPropertiesFormatException("Invalid parameters");
        }


    }

}
